package pack;

	import java.io.*;
	import java.util.*;

	public class Terminale {
	    private final LinkedList<Operazione> Terminale = new LinkedList<>();
	    private static final Scanner sc = new Scanner(System.in);
	    private static final Scanner sc2 = new Scanner(System.in);
	    private static final Magazzino m = new Magazzino();

	    public Terminale() throws IOException {
	        caricaDaFile();
	    }

	    public void creaOperazione(Operazione op) throws IOException {
	        Terminale.add(op);
	        m.modifica(op);
	        scriviSuFile();

	    }

	    public void creaOperazione() throws IOException {
	        System.out.println("Crea operazione ");
	        System.out.println("Inserisci importo dell'operazione: ");
	        float importo = sc.nextFloat();
	        System.out.println("Inserisci quantita' dell'operazione: ");
	        int quantita = sc.nextInt();
	        System.out.println("Inserisci descrizione dell'operazione: ");
	        String descrizione = sc2.nextLine();
	        System.out.println("Inserisci tipo dell'operazione (entrata=e - uscita=u): ");
	        String tip = sc2.nextLine();
	        tip = tip.toLowerCase();//converte in minuscolo
	        char tipo = tip.charAt(0);

	        Operazione op = new Operazione(importo, quantita, descrizione, tipo);
	        Terminale.add(op);
	        m.modifica(op);
	        scriviSuFile();
	    }

	    public void eliminaOperazione() { //NUOVO CODICE
	        visualizzaOperazioni();
	        System.out.println("inserisci descrizione dell'operazione che vuoi cancellare");
	        String descrizione = sc.nextLine();
	        Terminale.removeIf(a -> a.getDescrizione().equals(descrizione));
	    }

	    public void visualizzaOperazione(String descrizione) {
	        System.out.println("OPERAZIONE:");
	        for (Operazione a : Terminale) {
	            if (a.getDescrizione().equals(descrizione)) {
	                System.out.println(a);
	            }
	        }
	    }

	    public void visualizzaOperazioni() {
	        System.out.println("OPERAZIONI:");
	        for (Operazione a : Terminale) {
	            System.out.println(a);
	        }
	    }
	    public void caricaDaFile() throws IOException { //importo;quantita;descrizione;tipo
	        BufferedReader reader=new BufferedReader(new FileReader("operazioni.txt"));
	        String linea;
	        while((linea=reader.readLine())!=null){
	            String[] lineasplit=linea.split(";");
	            Operazione o=new Operazione(Float.parseFloat(lineasplit[0]),Integer.parseInt(lineasplit[1]),lineasplit[2],lineasplit[3].charAt(0));
	            Terminale.add(o);
	            m.modifica(o);

	        }
	        reader.close();
	    }
	    public void scriviSuFile() throws IOException { //importo;quantita;descrizione;tipo
			BufferedWriter writer = new BufferedWriter(new FileWriter("operazioni.txt"));
			for (Operazione o : Terminale) {
				writer.write(o.getImporto() + ";" + o.getQ() + ";" + o.getDescrizione() + ";" + o.getTipo());
				writer.newLine();
			}
			writer.close();
		}
		public void visualizzaQuantitaValore(){
			m.stampaProdotti();
			m.stampaIncassi();
		}

	}

