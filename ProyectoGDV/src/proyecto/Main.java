package proyecto;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Vector <Empleado> empleados=new Vector();
		Scanner sc=new Scanner(System.in);
		int opc;
		
		do {
			System.out.println("1.Alta\n2.Fichar\n.3.Pagar\n4.Pagar todos\n5.Informacion");
			opc=sc.nextInt();
			switch(opc){
			case 1:
				
					sc.nextLine();
					System.out.println("Nombre:");
					String nombre=sc.nextLine();
					System.out.println("Es propio?(S/N)");
					String resp=sc.nextLine();
					if (resp.equalsIgnoreCase("S")) {
						System.out.println("Salario base:");
						double base=sc.nextDouble();
						empleados.add(new Propio(nombre,base));
					}
					else {
						System.out.println("Empresa:");
						String empresa=sc.nextLine();
						empleados.add(new Externo(nombre,empresa));
					}
					
				
				break;
				
			case 2:
				System.out.println("Número del empleado:");
				int num=sc.nextInt();
				int pos=buscar(empleados,num);
				if (pos==-1)
					System.out.println("No encontrado");
				else {
					System.out.println("Horas realizadas:");
					int horas=sc.nextInt();
					empleados.get(pos).sumarHoras(horas);
				}
				break;
			case 3:
				System.out.println("Dinero a repartir:");
				double dinero=sc.nextDouble();
				int numPropios=Propio.getNumPropios();
				if (numPropios==0)
					System.out.println("No tengo empleados propios");
				else {
					for(int i=0;i<empleados.size();i++)
						//if (empleados[i] instanceof Propio) {
						if (empleados.get(i).getClass().getSimpleName().equals("Propio")) {
							// ((Propio)empleados[i]).setBeneficios(dinero/numPropios);
							Propio aux=(Propio)empleados.get(i);
							aux.setBeneficios(dinero/numPropios);
						}
				}
				break;
			case 4:
				for(int i=0;i<empleados.size();i++)
					System.out.println(empleados.get(i).pagar());
					
					
				}
			
		}while(opc!=6);
		
		
		

	}
	
	public static int buscar(Vector <Empleado> empleados,int num) {
		for(int i=0;i<empleados.size();i++)
			if (empleados.get(i).getNumero()==num)
				return i;
		return -1;
	}

}
