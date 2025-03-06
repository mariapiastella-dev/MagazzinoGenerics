package Progetto;

public class Elettronico extends Prodotto{
    
    public Elettronico(String nome, double prezzo) {
        super(nome, prezzo);
    }
    
    @Override
    public double getPrezzo() {
        return prezzo;
    }
}
