package util;

public class Employee {

	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return this.grossSalary - this.tax;
	}
	
	public void increaseSalary(double porcentagem) {
	    this.grossSalary = this.grossSalary + (this.grossSalary * (porcentagem / 100));
	}

}
