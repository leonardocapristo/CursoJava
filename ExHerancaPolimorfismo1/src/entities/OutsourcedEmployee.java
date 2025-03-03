package entities;

public class OutsourcedEmployee extends Employee {

	protected Double additionalCharge = 10.0;
	

	public OutsourcedEmployee() {

	}
	
	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour) {
		super(name, hours, valuePerHour);

	}




	public Double getAdditionalCharge() {
		return additionalCharge;
	}




	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}




	@Override
	public Double payment () {
		double salario = this.valuePerHour * this.hours ;
		double salarioComAumento = salario + (salario * additionalCharge /100) ;
		
		return salarioComAumento;
	}
	


}

