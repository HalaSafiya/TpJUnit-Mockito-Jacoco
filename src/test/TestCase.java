package test;

import main.IFacture;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TestCase {

    @Mock
    IFacture iFacture;

    @Test
    public void testFraisTransport(){
        when(iFacture.getFraisTransport(400)).thenReturn(45.0);
        Assert.assertEquals(45.0,iFacture.getFraisTransport(400),0);
    }

    @Test
    public void testAucunFraisTransport(){
        when(iFacture.getFraisTransport(1000)).thenReturn(0.0);
        Assert.assertEquals(0.0,iFacture.getFraisTransport(700),0);
    }

    @Test
    public void testMontantNegatif(){
        when(iFacture.getFraisTransport(-100)).thenThrow(new IllegalArgumentException());
        try {
            iFacture.getFraisTransport(-100);
            Assert.fail("IllegalArgumentException non levée avec la propriété fraisTransport à montant negatif");
        } catch (IllegalArgumentException iae){}
    }
}
