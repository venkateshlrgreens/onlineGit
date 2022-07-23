package org.test.tcs;

import org.test.cts.ClientDetails;

public class EmployeeDetails {

	private void empId() {
		System.out.println("Employee id is 100");
	}
	public void empName() {
		System.out.println("Employee name is Arun");
	}

	public static void main(String[] args) {
		EmployeeDetails e = new EmployeeDetails();
		e.empId();
		e.empName();
		CompanyDetails c=new CompanyDetails();
		c.compId();
		c.compName();
		ClientDetails cd=new ClientDetails();
		cd.clientId();
		cd.clientName();
	}

}
