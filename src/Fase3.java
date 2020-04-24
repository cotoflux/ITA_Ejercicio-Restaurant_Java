import java.util.ArrayList;
import java.util.Scanner;

public class Fase3 {

	
		public static void main(String[] args) {
			
			int cincCents = 500;
			int dosCents = 200;
			int cent = 100;
			int cincuanta = 50;
			int vint = 20;
			int deu = 10;
			int cinc = 5;
			int totalPreuMenjar = 0;
			
			String[] menu = new String[5];
			float[] preuPlat = new float[5];
			
			Scanner entrada1 = new Scanner(System.in);
			Scanner entrada2 = new Scanner(System.in);
			
			for(int i=0; i<menu.length; i++) {
				System.out.print("Introdueix el nom del plat:");
				menu[i]= entrada1.nextLine();
			}
			
			System.out.println(" Plat num.1: "+ menu[0]);
			System.out.println(" Plat num 2: "+ menu[1]);
			System.out.println(" Plat num 3: "+ menu[2]);
			System.out.println(" Plat num 4: "+ menu[3]);
			System.out.println(" Plat num 5: "+ menu[4]);
			
			for(int j=0; j<preuPlat.length; j++) {
				System.out.print("Introdueix el preu del plat:");
				preuPlat[j]= entrada2.nextFloat();			
				
			}
			
			System.out.println(" Preu plat 1: "+ preuPlat[0]);
			System.out.println(" Preu plat 2: "+ preuPlat[1]);
			System.out.println(" Preu plat 3: "+ preuPlat[2]);
			System.out.println(" Preu plat 4: "+ preuPlat[3]);
			System.out.println(" Preu plat 5: "+ preuPlat[4]);
			
			System.out.println("Quants plats vols menjar? ");
			int [] quantsPlats = new int[1];
			Scanner preguntaPlats = new Scanner(System.in);
			quantsPlats[0] = preguntaPlats.nextInt();
			
			//System.out.println(quantsPlats[0]);
			
			int limitPlats=0;
			ArrayList<Integer> comanda = new ArrayList<Integer>();
			while(quantsPlats[0] > limitPlats) {
				System.out.println("Tria el que vols per menjar, introdueix a la consola el número de plat 1, 2, 3,...");
				int [] numero = new int[1];
				Scanner seleccioPlats = new Scanner(System.in);
				numero[0] = seleccioPlats.nextInt();
				comanda.add(numero[0]);
				limitPlats++;
				
				//System.out.println(limitPlats);
			}
			
			System.out.println("La llista de plats demanada per el client" + comanda);
			
			float totalComanda=0;
		    for(int h=0; h<quantsPlats[0]; h++) {
		    	switch(comanda.get(h)) {
		    	case 1:
		    		System.out.println("El client vol: " + menu[0] + ", el preu del plat es " + preuPlat[0]);
		    		totalComanda += preuPlat[0];
		    		break;
		    	case 2:
		    		System.out.println("El client vol: " + menu[1] + ", el preu del plat es " + preuPlat[1]);
		    		totalComanda += preuPlat[0];
		    		break;
		    	case 3:
		    		System.out.println("El client vol: " + menu[2] + ", el preu del plat es " + preuPlat[2]);
		    		totalComanda += preuPlat[0];
		    		break;
		    	case 4:
		    		System.out.println("El client vol: " + menu[3] + ", el preu del plat es " + preuPlat[3]);
		    		totalComanda += preuPlat[0];
		    		break;
		    	case 5:
		    		System.out.println("El client vol: " + menu[4] + ", el preu del plat es " + preuPlat[4]);
		    		totalComanda += preuPlat[0];
		    		break;
		    	default:
		    		System.out.println("El producto que el client demana no existeix! Torna a fer la comanda");
		    
		    	}
		    }
		    
		    System.out.println("El total de la comanda es: " + totalComanda+"€");

	}

}
