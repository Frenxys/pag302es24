package pack;

public class Prodotto {
	private int q; //quantità
	private String descrizione;
	
	public Prodotto(int q, String d)
	{
		setQ(q);
		setDescrizione(d);
	}

	public int getQ() 
	{
		return q;
	}

	public void setQ(int q) 
	{
		this.q = q;
	}

	public String getDescrizione() 
	{
		return descrizione;
	}

	public void setDescrizione(String descrizione) 
	{
		this.descrizione = descrizione;
	}
	
	public void add(int i)
	{
		q+=i;
	}

}
