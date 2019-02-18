package proyecto;

public class Propio extends Empleado{
	
	private double salarioBase;
	private static int numPropios;
	private double beneficios;

	public Propio(String nombre, double salarioBase) {
		super(nombre, 15);
		this.salarioBase = salarioBase;
		numPropios++;
	}

	public static int getNumPropios() {
		return numPropios;
	}

	public void setBeneficios(double beneficios) {
		this.beneficios = beneficios;
	}
	
	public double pagar() {
		double total=salarioBase+beneficios+horas*precioHora;
		horas=0;
		beneficios=0;
		return total;
	}

	@Override
	public String toString() {
		return "Propio [salarioBase=" + salarioBase + ", beneficios=" + beneficios + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
	
	
	
	

}


