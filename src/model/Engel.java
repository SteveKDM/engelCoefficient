package model;

import java.io.Serializable;

// エンゲル係数に関する情報を保持するJavaBeans
public class Engel implements Serializable {
	private long totalExpense;
	private String totalExpenseComma;
	private long foodExpense;
	private String foodExpenseComma;
	private double engelCoefficient;
	private String adviceMsg;

	public long getTotalExpense() { return totalExpense; }
	public void setTotalExpense(long totalExpense) { this.totalExpense = totalExpense; }
	public String getTotalExpenseComma() { return totalExpenseComma; }
	public void setTotalExpenseComma(String totalExpenseComma) { this.totalExpenseComma = totalExpenseComma; }
	public long getFoodExpense() { return foodExpense; }
	public void setFoodExpense(long foodExpense) { this.foodExpense =foodExpense; }
	public String getFoodExpenseComma() { return foodExpenseComma; }
	public void setFoodExpenseComma(String foodExpenseComma) { this.foodExpenseComma = foodExpenseComma; }
	public double getEngelCoefficient() { return engelCoefficient; }
	public void setEngelCoefficient(double engelCoefficient) { this.engelCoefficient = engelCoefficient; }
	public String getAdviceMsg() { return adviceMsg; }
	public void setAdviceMsg(String adviceMsg) { this.adviceMsg = adviceMsg; }
}
