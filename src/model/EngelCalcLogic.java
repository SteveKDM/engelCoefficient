package model;

import java.text.NumberFormat;

public class EngelCalcLogic {
	public void execute(Engel engel) {

		// エンゲル係数を算出して設定
		long totalExpense = engel.getTotalExpense();
		long foodExpense = engel.getFoodExpense();
		double engelCoefficient = (double)Math.floor((double) foodExpense / totalExpense * 1000)/10;
		engel.setEngelCoefficient(engelCoefficient);

		// 「家計総支出」「食費支出額」をカンマ形式にして設定
		String totalExpenseComma = NumberFormat.getInstance().format(totalExpense);
		String foodExpenseComma = NumberFormat.getInstance().format(foodExpense);
		engel.setTotalExpenseComma(totalExpenseComma);
		engel.setFoodExpenseComma(foodExpenseComma);

		// エンゲル係数からメッセージ（アドバイス）を設定
		// 15-20%を適正とする
		String adviceMsg;
		if(engelCoefficient < 15) {
			adviceMsg = "食費を十分に抑えられています。もう少し贅沢しても良いです。";
		} else if(engelCoefficient <= 20) {
			adviceMsg = "適正値です。この調子で頑張りましょう。";
		} else {
			adviceMsg = "エンゲル係数が高いです。食費を抑えていきましょう。";
		}
		engel.setAdviceMsg(adviceMsg);
	}
}
