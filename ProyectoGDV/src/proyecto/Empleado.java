package proyecto;

public abstract class Empleado {

	private String nombre;
	private int numero;
	protected int horas;
	protected double precioHora;
	private static int numEmpleados;
	public Empleado(String nombre,double precioHora) {
		super();
		this.nombre = nombre;
		this.precioHora=precioHora;
		numEmpleados++;
		numero=numEmpleados;
	}
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", numero=" + numero + ", horas=" + horas + ", precioHora=" + precioHora
				+ "]";
	}
	public void sumarHoras(int horas) {
		this.horas=this.horas+horas;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public int getNumero() {
		return numero;
	}
	public int getHoras() {
		return horas;
	}
	public double getPrecioHora() {
		return precioHora;
	}
	public static int getNumEmpleados() {
		return numEmpleados;
	}
	public abstract double pagar();
	
}
	
	

