package pack;

public class Operazione {
	
	private float importo;
	private int q; //quantità
	private String descrizione;
	private char tipo;
	
	public Operazione(float importo, int q, String d, char t)
	{
		setImporto(importo);
		setQ(q);
		setDescrizione(d);
		setTipo(t);
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
