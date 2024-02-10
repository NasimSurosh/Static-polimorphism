package assignment2;

public class PermanentEmployee extends CalculateSlary {

	private double salary;
	private double bonus;

	public PermanentEmployee(double salary, double bonus) {
		this.salary = salary;
		this.bonus = bonus;
	}

	@Override
	public double calculatePayRoll() {
		return salary + bonus;
	}

}
