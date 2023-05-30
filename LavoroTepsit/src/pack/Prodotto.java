package pack;

public class Prodotto {
	private int q; //quantità
	private String descrizione;
	
	public Prodotto(int q, String d)
	{
		setQ(q);
		setDescrizione(d);
	}

	@Override
	public String toString() {
		return
				"quantità=" + q +
				", descrizione='" + descrizione + '\'' +
				'}';
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
	public void sub(int i)
	{
		q-=i;
	}

}
