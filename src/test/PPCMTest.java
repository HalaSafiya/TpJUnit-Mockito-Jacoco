package test;

import main.PPCM;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PPCMTest {
    PPCM ppcm=new PPCM();

    @Before
    public void setUp() throws Exception{
        this.ppcm = new PPCM();
    }

    @Test
    public void testPpcmSuperieur(){
        int a=9;
        int b=2;
        int p=18;
        Assert.assertEquals(p,ppcm.ppcm(a,b));
    }

    @Test
    public void testPpcmInferieur(){
        int a=5;
        int b=15;
        int p=15;
        Assert.assertEquals(p,ppcm.ppcm(a,b));
    }

    @Test
    public void testPpcmEgal(){
        int a=5;
        int b=5;
        int p=5;
        Assert.assertEquals(p,ppcm.ppcm(a,b));
    }

    @After
    public void tearDown() throws Exception{
        this.ppcm = null;
    }
}
