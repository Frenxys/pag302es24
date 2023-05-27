package pack;
import java.util.*;

public class Terminale {
	private final LinkedList <Operazione> Terminale = new LinkedList<>();
	private static final Scanner sc= new Scanner(System.in);
	private static Magazzino m = new Magazzino();
	
	public Terminale() {
		
	}
	
	public void creaOperazione(Operazione op) {
		Terminale.add(op);
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
	m.modifica(op);
}

	public void eliminaOperazione() { //NUOVO CODICE
	visualizzaOperazioni();
	System.out.println("inserisci descrizione dell'operazione che vuoi cancellare");
	String descrizione=sc.nextLine();
	Terminale.removeIf(a -> a.getDescrizione().equals(descrizione));
	}

	/*public void eliminaOperazione(String descrizione) { VECCHIO CODICE
	for(int i=0; i<Terminale.size(); i++) {
		if(Terminale.get(i).getDescrizione().equals(descrizione)) {
			Terminale.remove(i);
		}
	}
	}*/
	
	public void visualizzaOperazione(String descrizione) {
	System.out.println("OPERAZIONE:");
	for(Operazione a:Terminale) {
		if(a.getDescrizione().equals(descrizione)){
			System.out.println(a);
		}
	}
	}
	public void visualizzaOperazioni(){
	System.out.println("OPERAZIONI:");
	for(Operazione a:Terminale) {
		System.out.println(a);
	}
}


	

}
