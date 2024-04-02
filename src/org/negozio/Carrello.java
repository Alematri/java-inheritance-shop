package org.negozio;

import java.util.ArrayList;
import java.util.Scanner;

public class Carrello {
    private ArrayList<Prodotto> prodotti;

    public Carrello() {
        this.prodotti = new ArrayList<>();
    }

    public void aggiungiProdotto(Prodotto prodotto) {
        prodotti.add(prodotto);
    }

    public void stampaSintesiCarrello() {
        System.out.println("Sintesi del carrello:");

        for (Prodotto prodotto : prodotti) {
            System.out.println(prodotto.getNome() + " - " + prodotto.getPrezzo());
        }

        double totale = calcolaTotaleCarrello();
        System.out.println("Totale: " + totale);
    }

    private double calcolaTotaleCarrello() {
        double totale = 0.0;
        for (Prodotto prodotto : prodotti) {
            totale += prodotto.getPrezzoConIva();
        }
        return totale;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carrello carrello = new Carrello();

        boolean continua = true;
        while (continua) {
            System.out.println("Vuoi inserire uno Smarphone, un Televisore o delle Cuffie? (s/t/c)");
            String scelta = scanner.next().toLowerCase();

            switch (scelta) {
                case "s":
                    System.out.println("Inserisci codice, nome, marca, prezzo, iva, IMEI e memoria:");
                    int codice = scanner.nextInt();
                    String nome = scanner.next();
                    String marca = scanner.next();
                    double prezzo = scanner.nextDouble();
                    double iva = scanner.nextDouble();
                    String imei = scanner.next(); // Leggiamo il numero IMEI come stringa
                    int memoria = scanner.nextInt();
                    carrello.aggiungiProdotto(new Smartphone(codice, nome, marca, prezzo, iva, imei, memoria));
                    break;
                case "t":
                    System.out.println("Inserisci codice, nome, marca, prezzo, iva, dimensioni e smart (true/false):");
                    codice = scanner.nextInt();
                    nome = scanner.next();
                    marca = scanner.next();
                    prezzo = scanner.nextDouble();
                    iva = scanner.nextDouble();
                    int dimensioni = scanner.nextInt();
                    boolean smart = scanner.nextBoolean();
                    carrello.aggiungiProdotto(new Televisori(codice, nome, marca, prezzo, iva, dimensioni, smart));
                    break;
                case "c":
                    System.out.println("Inserisci codice, nome, marca, prezzo, iva, colore e wireless (true/false):");
                    codice = scanner.nextInt();
                    nome = scanner.next();
                    marca = scanner.next();
                    prezzo = scanner.nextDouble();
                    iva = scanner.nextDouble();
                    String colore = scanner.next();
                    boolean wireless = scanner.nextBoolean();
                    carrello.aggiungiProdotto(new Cuffie(codice, nome, marca, prezzo, iva, colore, wireless));
                    break;
                default:
                    System.out.println("Scelta non valida.");
            }

            System.out.println("Vuoi continuare? (sì/no)");
            String risposta = scanner.next().toLowerCase();
            continua = risposta.equals("sì") || risposta.equals("s");
        }

        carrello.stampaSintesiCarrello();
        scanner.close();
    }
}
