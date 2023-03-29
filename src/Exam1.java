import java.util.ArrayList;
import java.util.Scanner;

public class Exam1 {
	
	public static Scanner entrada = new Scanner(System.in);
	public static ArrayList <Empleats> llistaEmpleats = new ArrayList<>();
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcio;
		
		do {
		System.out.println("Introdueix l´opció desitjada: "
				+ "\n1. Crear Comercial"
				+ "\n2. Crear Repartidor"
				+ "\n3. Veure Empleat"
				+ "\n0. Sortir");
		
		opcio = entrada.nextInt();
		
			switch(opcio) {
			
			case 1 : crearComercial();
				break;
			case 2:  crearRepartidor();
				break;
			case 3:  veureEmpleat();
				break;
			case 0:
				System.out.println("Adéu!");
				break;
			default:
				System.out.println("L´opció escollida no es válida");
				System.out.println("");
			}	
		
	}while (opcio != 0);
	}
		
		
	public static void crearComercial() {
		
		String nom;
		int edat;
		float salari;
		double comissio;
		
		entrada.nextLine();
		
		System.out.println("Introdueix el nom del Comercial: ");
		nom = entrada.nextLine();
		System.out.println("Introdueix l´edat del Comercial: ");
		edat = entrada.nextInt();
		System.out.println("Introdueix el salari inicial del Comercial: ");
		salari = entrada.nextFloat();
		System.out.println("Introdueix la comissió del Comercial: ");
		comissio = entrada.nextDouble();
		
		Comercial comercial0 = new Comercial( nom,edat,salari,comissio);
		llistaEmpleats.add(comercial0);
	
}
	public static void crearRepartidor() {
		
		String nom;
		int edat;
		float salari;
		String zona;
		
		entrada.nextLine();
		
		System.out.println("Introdueix el nom del Repartidor: ");
		nom = entrada.nextLine();
		System.out.println("Introdueix l´edat del Repartidor: ");
		edat = entrada.nextInt();
		System.out.println("Introdueix el salari inicial del Repartidor: ");
		salari = entrada.nextFloat();
		entrada.nextLine();
		System.out.println("Introdueix la zona de feina del Repartidor ");
		zona = entrada.nextLine();
		
		Repartidor repartidor0 = new Repartidor(nom,edat,salari,zona);
		llistaEmpleats.add(repartidor0);
	
}

	public static void veureEmpleat() {
	
		String nom;
		int posEmpleat = -1;
		boolean endF = false;
		int i = 0;
		entrada.nextLine();
				
		System.out.println("Introdueix el nom de l´empleat a cercar: ");
		nom = entrada.nextLine();
		
		while(i < llistaEmpleats.size() && !endF) {
			Empleats ComercialTrovat = llistaEmpleats.get(i);
			
			if(nom.equalsIgnoreCase(ComercialTrovat.getNom())) {
				endF = true;
				posEmpleat = i;
			}
			i++;
		}
		if(endF) {
			
			System.out.println(llistaEmpleats.get(posEmpleat).toString());
			if(llistaEmpleats.get(posEmpleat).getPlus() == true) {
				System.out.println("Aquest empleat disposa d´un plus de 300 € amb lo qual es seu nou"
						+ " salari passa a ser de " + llistaEmpleats.get(posEmpleat).getSalari());
				
			}
			System.out.println("");
		}else {
			System.out.println("El comercial cercat no s´ha trovat");
			System.out.println("");
	
		}		}
		
	
	
}
	

