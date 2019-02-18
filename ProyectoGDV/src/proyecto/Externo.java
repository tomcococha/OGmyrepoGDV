package proyecto;

public class Externo extends Empleado{
	
	private String empresa;

	public Externo(String nombre, String empresa) {
		super(nombre, 22);
		this.empresa = empresa;
	}
	public double pagar() {
		double total=horas*precioHora;
		horas=0;
		return total;
	}

	
	
	
}


