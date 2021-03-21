package model;

public class EngelCalcLogic {
	public void execute(Engel engel) {

		// エンゲル係数を算出して設定
		int totalExpense = engel.getTotalExpense();
		int foodExpense = engel.getFoodExpense();
		double engelCoefficient = (double)Math.floor((double) foodExpense / totalExpense * 1000)/10;
		engel.setEngelCoefficient(engelCoefficient);

		// エンゲル係数からメッセージ（アドバイス）を設定
		// 15-20%を適性とする
		String adviceMsg;
		if(engelCoefficient < 15) {
			adviceMsg = "食費を十分に抑えられています。もう少し贅沢しても良いです。";
		} else if(engelCoefficient <= 20) {
			adviceMsg = "適性値です。この調子で頑張りましょう。";
		} else {
			adviceMsg = "エンゲル係数が高いです。食費を抑えていきましょう。";
		}
		engel.setAdviceMsg(adviceMsg);
	}
}
