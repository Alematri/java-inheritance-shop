package org.negozio;

public class Cuffie extends Prodotto {
    private String colore;
    private boolean wireless;

    public Cuffie(int codice, String nome, String marca, double prezzo, double iva, String colore, boolean wireless) {
        super(codice, nome, marca, prezzo, iva);
        this.colore = colore;
        this.wireless = wireless;
    }

    public String getColore() {
        return colore;
    }

    public boolean isWireless() {
        return wireless;
    }

    public void stampaDettagli() {
        System.out.println("Codice: " + getCodice());
        System.out.println("Nome: " + getNome());
        System.out.println("Marca: " + getMarca());
        System.out.println("Prezzo: " + getPrezzo());
        System.out.println("IVA: " + getPrezzoConIva()); // Correzione qui
        System.out.println("Colore: " + colore);
        System.out.println("Wireless: " + (wireless ? "Sì" : "No"));
    }
}
