package Progetto;

public abstract class Prodotto implements ConPrezzo {
    
    private String nome; 
    private double prezzo;
    
    public Prodotto(String nome, double prezzo) {
        this.nome = nome; 
        this.prezzo = prezzo;
    }
    
    @Override 
    public String toString() {
        return nome + ": " + prezzo + "€";
    }
    
}
