package SistemaSolar;

import java.util.Scanner;
import Planetarium.Planetarium;

public class SistemaSolar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Planetarium planeta = new Planetarium();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Seleccione un Planeta");
		System.out.println("1 - Mercurio");
		System.out.println("2 - Venus");
		System.out.println("3 - Tierra");
		System.out.println("4 - Marte");
		System.out.println("5 - Júpiter");
		System.out.println("6 - Saturno");
		System.out.println("7 - Urano");
		System.out.println("8 - Neptuno");
		String mundo = scanner.nextLine();
		switch(mundo) {
		case ("1"): planeta.Mercurio();
				  System.out.println();
				  main(args);
				  break;
				  
		case ("2"): planeta.Venus();
				  System.out.println();
				  main(args);
				  break;
				  
		case ("3"): planeta.laTierra();
				  System.out.println();
				  main(args);
				  break;
				  
		case ("4"): planeta.Marte();
				  System.out.println();
				  main(args);
				  break;
				  
		case ("5"): planeta.Jupiter();
			 	  System.out.println();
				  main(args);
				  break;
				  
		case ("6"): planeta.Saturno();
				  System.out.println();
				  main(args);
				  break;
				  
		case ("7"): planeta.Urano();
				  System.out.println();
				  main(args);
				  break;
				  
		case ("8"): planeta.Neptuno();
				  System.out.println();
				  main(args);
				  break;
		 default: System.out.println("Ha ingresado una opcion no valida");
		 		  System.out.println();
		  		  main(args);
		  		  break;
		}
	}

}
