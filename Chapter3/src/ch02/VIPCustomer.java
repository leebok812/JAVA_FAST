package ch02;

public class VIPCustomer extends Customer {

	/*
	 * private int customerID; private String customerName; private String
	 * customerGrade; int bonusPoint; double bonusRatio;
	 */ // Customer���� ��� �޴� �͵�

	double salesRatio;
	private String agentID;

	public VIPCustomer() {

		bonusRatio = 0.05;
		salesRatio = 0.1;
		customerGrade = "VIP";
	}

	public String getAgentID() {
		return agentID;
	}

	public void setAgentID(String agentID) {
		this.agentID = agentID;
	}

}
