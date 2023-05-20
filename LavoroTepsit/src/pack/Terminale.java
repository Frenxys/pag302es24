package pack;
import java.util.*;

public class Terminale {
	private LinkedList <Operazione> Terminale = new LinkedList<>();
	private static Scanner sc= new Scanner(System.in);
	
public Terminale() {
	
}

public void creaOperazione() {
	System.out.println("Crea operazione ");
	System.out.println("Inserisci importo dell'operazione: ");
	float importo=sc.nextFloat();
	System.out.println("Inserisci quantita' dell'operazione: ");
	int quantita=sc.nextInt();
	System.out.println("Inserisci descrizione dell'operazione: ");
	String descrizione= sc.nextLine();
	System.out.println("Inserisci tipo dell'operazione (entrata=e - uscita=u: ");
	String tip=sc.nextLine();
	tip=tip.toLowerCase();//converte in minuscolo
	char tipo=tip.charAt(0);
	
	Operazione op=new Operazione(importo, quantita, descrizione, tipo);
	Terminale.add(op);
}

public void eliminaOperazione(String descrizione) {
	for(int i=0; i<Terminale.size(); i++) {
		if(Terminale.get(i).getDescrizione().equals(descrizione)) {
			Terminale.remove(i);
		}
	}
}




	

}
