package org.negozio;

public class Smartphone extends Prodotto {
    private String imei;
    private int memoria;

    public Smartphone(int codice, String nome, String marca, double prezzo, double iva, String imei, int memoria) {
        super(codice, nome, marca, prezzo, iva);
        this.imei = imei;
        this.memoria = memoria;
    }

    // Metodi getter per IMEI e memoria
    public String getImei() {
        return imei;
    }

    public int getMemoria() {
        return memoria;
    }

    // Metodo toString per ottenere una rappresentazione testuale dello Smartphone
    public String toString() {
        return super.toString() + ", IMEI: " + imei + ", Memoria: " + memoria + "GB";
    }
}