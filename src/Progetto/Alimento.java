package Progetto;

public class Alimento extends Prodotto {

    public Alimento(String nome, double prezzo) {
        super(nome, prezzo);
    }
    
    @Override 
    public double getPrezzo() {
        return prezzo;
    }
}
