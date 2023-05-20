package pack;

public class Operazione {
	
	private float importo;
	private int q; //quantità
	private String descrizione;
	private char tipo;
	
	public Operazione(float importo, double q, String d, char t, Terminale terminale)
	{
		setImporto(importo);
		setQ(q);
		setDescrizione(d);
		setTipo(t);
		
		terminale.AddOperazione(importo, q, d);
	}
	
	public void setImporto(float importo)
	{
		this.importo = importo;
	}
	public float getImporto()
	{
		return importo;
	}
	
	public void setQ(int q)
	{
		this.q = q;
	}
	public int getQ()
	{
		return q;
	}
	
	public void setDescrizione(String d)
	{
		this.descrizione = d;
	}
	public String getDescrizione()
	{
		return descrizione;
	}
	
	public void setTipo(char t)
	{
		this.tipo = t;
	}
	public char getTipo()
	{
		return tipo;
	}

}
