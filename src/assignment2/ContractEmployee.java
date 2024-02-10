package assignment2;

public class ContractEmployee extends CalculateSlary {

	private double hourlyRate;
	private double hourlyWorked;

	public ContractEmployee(double hourlyRate, double hourlyWorked) {
		this.hourlyRate = hourlyRate;
		this.hourlyWorked = hourlyWorked;

	}

	@Override
	public double calculatePayRoll() {
		return hourlyRate * hourlyWorked;
	}

}
