package pack;
import java.util.LinkedList;
import java.util.Scanner;

public class Magazzino {
	private final LinkedList <Prodotto> Magazzino = new LinkedList<>();
	private static final Scanner sc= new Scanner(System.in);
	private double incassi=0; //di base gli incassi sono 0, l'azienda può andare in negativo contando i debiti
	
	public Magazzino()
	{
		
	}

	public LinkedList<Prodotto> getMagazzino() {
		return Magazzino;
	}

	public void setIncassi(double i)
	{
		incassi = i;
	}
	public double getIncassi()
	{
		return incassi;
	}

	
	public void add(Prodotto p)
	{
		Magazzino.add(p);
	}
	
	public void stampaProdotti()
	{

		System.out.println(Magazzino.size());
		for (Prodotto p:Magazzino)
		{
			System.out.println("Prodotto "+Magazzino.indexOf(p)+")"+p);
			
		}
	}
	
	public void stampaIncassi()
	{
		System.out.println("Incassi TOT = "+getIncassi());
	}
	public void modifica(Operazione o)
	{
		//System.out.println(o.getTipo());
		if (o.getTipo() == 'e')
		{
			entrata(o);
		}
		else
		{
			uscita(o);
		}
	}

	public void entrata(Operazione o) //comprare
	{
		incassi-=o.getImporto();
			boolean aggiungi=true;
			for (Prodotto p:Magazzino) {
				if (p.getDescrizione().equals(o.getDescrizione())) //controllo descrizione prodotto
				{

					p.add(o.getQ());
					aggiungi=false;
					break;

				}
			}
			if(aggiungi){
				Magazzino.add(new Prodotto(o.getQ(),o.getDescrizione()));
			}



	}
	
	public void uscita(Operazione o) //vendere
	{
		incassi+=o.getImporto();

		for (Prodotto p:Magazzino)
		{
			if(p.getDescrizione().equals(o.getDescrizione())) //controllo descrizione prodotto
			{
				if(p.getQ()<=o.getQ()){
						System.out.println("non abbiamo più prodotti");
						Magazzino.remove(p);

				}else{
					p.sub(o.getQ());

				}
				break;
 			}
		}
	}

}
