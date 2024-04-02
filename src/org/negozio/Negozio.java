package org.negozio;

public class Negozio {
    public static void main(String[] args) {

        Carrello carrello = new Carrello();
        Smartphone smartphone = new Smartphone(1, "Nokia 3330", "Nokia", 300, 0.22, "123456789012345", 32);
        Televisori televisori = new Televisori(2, "TV a tubo catodico", "Telefunken", 1000, 0.22, 20, false);
        Cuffie cuffie = new Cuffie(3, "Cuffie da mare", "Panasoic", 100, 0.22, "Rosa", true);

        carrello.aggiungiProdotto(smartphone);
        carrello.aggiungiProdotto(televisori);
        carrello.aggiungiProdotto(cuffie);

        System.out.println("Prodotti nel carrello:");
        carrello.stampaSintesiCarrello();
    }
}
