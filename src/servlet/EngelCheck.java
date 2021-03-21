package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Engel;
import model.EngelCalcLogic;

/**
 * Servlet implementation class HealthCheck
 */
@WebServlet("/EngelCheck")
public class EngelCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// フォワード
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/engelCheck.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// リクエストパラメータを取得
		String totalExpense = request.getParameter("totalExpense");
		String foodExpense = request.getParameter("foodExpense");

		// 入力値をプロパティに設定
		Engel engel = new Engel();
		engel.setTotalExpense(Integer.parseInt(totalExpense));
		engel.setFoodExpense(Integer.parseInt(foodExpense));

		// エンゲル係数を計算し、結果を設定
		EngelCalcLogic engelCalcLogic = new EngelCalcLogic();
		engelCalcLogic.execute(engel);

		// リクエストスコープに保存
		request.setAttribute("engel", engel);

		// フォワード
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/engelCheckResult.jsp");
		dispatcher.forward(request, response);
	}
}
