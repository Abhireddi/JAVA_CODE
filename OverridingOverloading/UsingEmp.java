package OverridingOverloading;

import OverridingOverloading.Employee;

public class UsingEmp extends Employee {// in overriding method must use extend
										// keyword to extend parent class
	void EmployeeDetails(String Name) {
		System.out.println("Employee Name is:" + Name);
	}

	// overloading
	void EmployeeDetails(String Name, int IdNo)// same method with diff
												// parameters
	{
		System.out.println("Employee Name is:" + Name + "IdNumber:" + IdNo);
	}

	// overriding the parent method by using same method name
	public void EmployeeAddress() {
		System.out.println("In child class");
	}

	public static void main(String[] args) {
		String EmployeeName = "Abhilash";
		int IdNumber = 75006;

		// as the method are not static must create obj
		UsingEmp obj = new UsingEmp();
		obj.EmployeeDetails(EmployeeName);
		obj.EmployeeDetails(EmployeeName, IdNumber);
		obj.EmployeeAddress();

	}

}
