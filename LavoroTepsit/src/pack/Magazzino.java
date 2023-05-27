package pack;
import java.util.LinkedList;
import java.util.Scanner;

public class Magazzino {
	private final LinkedList <Prodotto> Magazzino = new LinkedList<>();
	private static final Scanner sc= new Scanner(System.in);
	private double incassi;
	
	public Magazzino()
	{
		
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
		for (Prodotto p:Magazzino)
		{
			System.out.println("Prodotto "+Magazzino.indexOf(p)+")\n"+p);
			
		}
	}
	
	public void stampaIncassi()
	{
		System.out.println("Incassi TOT = "+getIncassi());
	}
	
	public void modifica(Operazione o)
	{
		if (o.getTipo() == 'e')
		{
			entrata(o.getDescrizione(), o.getImporto(), o.getQ());
		}
		else
		{
			uscita(o.getDescrizione(), o.getImporto(), o.getQ());
		}
	}
	
	public void entrata(String d, double i, int q)
	{
		setIncassi(getIncassi()-i);
		
		for (Prodotto p:Magazzino)
		{
			if(p.getDescrizione().equals(d))
			{
				p.add(q);
			}
		}
	}
	
	public void uscita(String d, double i, int q)
	{
		setIncassi(getIncassi()+i);
		
		for (Prodotto p:Magazzino)
		{
			if(p.getDescrizione().equals(d) && p.getQ()<=q)
			{
				
 			}
		}
	}
}
