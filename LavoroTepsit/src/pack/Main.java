package pack;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Terminale t=new Terminale();
		Scanner sc= new Scanner(System.in);
		Scanner sc2= new Scanner(System.in);


		int scelta=0;
		do{
			System.out.println("Menu'");
			System.out.println("1) visualizza operazione specifica \n2) visualizza operazioni\n3) crea operazione\n4) elimina operazione\n5)visualizza quantità valore\n0)exit");
			System.out.print("Inserisci cosa vuoi fare: ");
			scelta= sc.nextInt();
			switch(scelta) {
				case 1:
					System.out.println("Inserisci descrizione prodotto:");
					String d= sc2.nextLine();
					t.visualizzaOperazione(d);break;
				case 2: t.visualizzaOperazioni();break;
				case 3: t.creaOperazione();break;
				case 4: t.eliminaOperazione();break;
				case 5: t.visualizzaQuantitaValore();break;

			}

		}while(scelta!=0);

	}
}
