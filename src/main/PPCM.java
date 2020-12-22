package main;

public class PPCM {
    //Plus Petit Multiple Commun
    public int ppcm(int a,int b)
    {
        int p=a*b;
        while (a!=b)
            if (a<b)
                b-=a;
            else
                a-=b;
        return p/a;
    }
}
