package model;

import java.io.Serializable;

// エンゲル係数に関する情報を保持するJavaBeans
public class Engel implements Serializable {
	private int totalExpense;
	private int foodExpense;
	private double engelCoefficient;
	private String adviceMsg;

	public int getTotalExpense() { return totalExpense; }
	public void setTotalExpense(int totalExpense) { this.totalExpense = totalExpense; }
	public int getFoodExpense() { return foodExpense; }
	public void setFoodExpense(int foodExpense) { this.foodExpense =foodExpense; }
	public double getEngelCoefficient() { return engelCoefficient; }
	public void setEngelCoefficient(double engelCoefficient) { this.engelCoefficient = engelCoefficient; }
	public String getAdviceMsg() { return adviceMsg; }
	public void setAdviceMsg(String adviceMsg) { this.adviceMsg = adviceMsg; }
}
