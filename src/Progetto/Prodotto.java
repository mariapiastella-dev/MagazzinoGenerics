package Progetto;

public abstract class Prodotto implements ConPrezzo {
    
    protected String nome; 
    protected double prezzo;
    
    public Prodotto(String nome, double prezzo) {
        this.nome = nome; 
        this.prezzo = prezzo;
    }
    
    @Override 
    public String toString() {
        return nome + ": " + prezzo + "€"; 
    }
    
}
