package test;

import main.Facture;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactureTest {
    Facture facture = new Facture();

    @Before
    public void setUp() throws Exception{
        this.facture=new Facture();
    }

    @After
    public void tearDown() throws Exception {
        this.facture = null;
    }

    @Test
    public void testGetFraisTransport(){
        double actual = facture.getFraisTransport(475);
        assertEquals(45, actual,0);
    }

    @Test
    public void testAucunFraisTransport(){
        double actual = facture.getFraisTransport(905);
        assertEquals(0, actual,0);
    }

    @Test
    public void testFraisNegatif(){
        try{
            facture.getFraisTransport(-100);
            Assert.fail("IllegalArgumentException Montant de transport negatif");
        } catch(IllegalArgumentException iae){}
    }
}
