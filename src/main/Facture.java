package main;

public class Facture {
    public double getFraisTransport(double montant){
        if(montant<600){
            return 45;
        }
        return 0;
    }
}
