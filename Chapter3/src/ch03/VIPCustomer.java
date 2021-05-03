package ch03;

public class VIPCustomer extends Customer {

	/*
	 * private int customerID; private String customerName; private String
	 * customerGrade; int bonusPoint; double bonusRatio;
	 */ // Customer에서 상속 받는 것들

	double salesRatio;
	private String agentID;

	/*
	 * public VIPCustomer() {
	 * 
	 * bonusRatio = 0.05; salesRatio = 0.1; customerGrade = "VIP";
	 * 
	 * System.out.println("VIPCustomer() call"); }
	 */

	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);

		// 상속 안받고 값을 여기서 재설정 해줄수 있음
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.01;

		System.out.println("VIPCustomer(int, String) call");

	}

	public String getAgentID() {
		return agentID;
	}

	public void setAgentID(String agentID) {
		this.agentID = agentID;
	}

}
