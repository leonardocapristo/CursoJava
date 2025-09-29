package entities;

public class Student {
	public String name;
	public double n1,n2,n3;

	
	public String verifyGrades() {
		double media = n1+n2+n3;
		String result;
		if (media >= 60) {
			
			result = "Aprovado";
		} else {
			result = "Reprovado";
		}
		
		return result;
	}

}
