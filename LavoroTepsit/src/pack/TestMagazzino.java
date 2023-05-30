package pack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pack.Magazzino;

import java.util.LinkedList;

public class TestMagazzino {
    private Magazzino magazzino;

    @BeforeEach
    public void setup() {
        magazzino = new Magazzino();
    }

    @Test
    public void testAdd() {
        Prodotto prodotto = new Prodotto(10, "Prodotto A");
        magazzino.add(prodotto);

        LinkedList<Prodotto> magazzinoList = magazzino.getMagazzino();
        Assertions.assertEquals(1, magazzinoList.size());
        Assertions.assertEquals(prodotto, magazzinoList.get(0));
    }

    @Test
    public void testEntrata() {
        Operazione operazione = new Operazione(32, 10, "Prodotto A", 'e');
        magazzino.entrata(operazione);

        LinkedList<Prodotto> magazzinoList = magazzino.getMagazzino();
        Assertions.assertEquals(1, magazzinoList.size());
        Assertions.assertEquals(10, magazzinoList.get(0).getQ());
        Assertions.assertEquals(-32.0, magazzino.getIncassi());
        Assertions.assertEquals("Prodotto A", magazzinoList.get(0).getDescrizione());
    }

    @Test
    public void testModifica_Uscita() {
        Prodotto prodotto = new Prodotto(10, "Prodotto A");
        magazzino.add(prodotto);

        Operazione operazione = new Operazione(10, 5, "Prodotto A", 'u');
        magazzino.modifica(operazione);

        LinkedList<Prodotto> magazzinoList = magazzino.getMagazzino();
        Assertions.assertEquals(1, magazzinoList.size());
        Assertions.assertEquals(5, magazzinoList.get(0).getQ());
        Assertions.assertEquals("Prodotto A", magazzinoList.get(0).getDescrizione());
    }

    @Test
    public void testEntrata2() {
        Operazione operazione = new Operazione(10, 5, "Prodotto A", 'e');
        Operazione o2 = new Operazione(10, 5, "Prodotto A", 'e');
        magazzino.modifica(operazione);
        magazzino.modifica(o2);

        LinkedList<Prodotto> magazzinoList = magazzino.getMagazzino();
        Assertions.assertEquals(1, magazzinoList.size());
        Assertions.assertEquals(10, magazzinoList.get(0).getQ());
        Assertions.assertEquals("Prodotto A", magazzinoList.get(0).getDescrizione());
        Assertions.assertEquals(-20.0, magazzino.getIncassi());
    }
}
