package pack;

public class Main {

	public static void main(String[] args) {

		Terminale t=new Terminale();
		t.creaOperazione(new Operazione(3,3,"ciao",'e'));
		t.creaOperazione(new Operazione(2,1,"ciao2",'u'));
		t.visualizzaOperazione("ciao");
		t.eliminaOperazione();
		t.visualizzaOperazioni();
	}

}
