package assignment2;

public class Main {

	public static void main(String[] args) {
		
		CalculateSlary pE = new PermanentEmployee(2000, 400);
		CalculateSlary cE = new ContractEmployee(25, 57);
		
		
		
		
		
		displayEmp("perment Employee", pE);
		System.out.println();
		displayEmp("contract Employee", cE);
		
		

	}
	public static void displayEmp(String employeeType, CalculateSlary payroll) {
		double rule = payroll.calculatePayRoll();
		System.out.println(employeeType + " Payroll " + rule);
	}

}
