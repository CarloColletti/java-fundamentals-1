package org.learning.java;

import java.util.Scanner;



public class TrainTicket {
    /**
     * Esercizio 1: Calcolo biglietto del treno
     * Consegna: Il programma dovrà chiedere all’utente il numero (intero) di chilometri che vuole percorrere e l’età del passeggero (numero intero). Sulla base di queste informazioni dovrà calcolare il prezzo totale del viaggio, secondo queste regole:
     * il prezzo del biglietto è definito in base ai km (0.21 € al km)
     * va applicato uno sconto del 20% per i minorenni
     * va applicato uno sconto del 40% per gli over 65
     * Per chiedere informazioni all’utente sarà necessario usare la classe java.util.Scanner, come visto in classe stamattina.
     * Bonus: formattare il risultato con un numero limitato di decimali utilizzando la classe DecimalFormat
     */

    public static void main(String[] args) {
        //create scanner variable
        Scanner keyboardInput = new Scanner(System.in);

        // rate for older
        int ageRequireOlder = 65;
        int rateOlder = 40;

        // rate for children
        int ageRequireChildren = 18;
        int rateChildren = 20;

        // ticket prise
        double ticketPrise = 0.21;

        // ticket Sale Prise
        double ticketSale;

        // variable km
        int kilometers;

        // passenger age
        int agePassenger;

        // request kilometers
        System.out.print("Inserisci il numero di chilometri che devi percorrere: ");
        kilometers = keyboardInput.nextInt();

        // request age
        System.out.print("Quanti anni hai? ");
        agePassenger = keyboardInput.nextInt();

        // calc the price for kilometers
        double fullPrise = kilometers * ticketPrise;

        // full prise is:
        System.out.print("Il prezzo del biglietto è:");
        System.out.println(fullPrise);

        if (agePassenger <= ageRequireChildren) {
            // if you are children
            System.out.println("Ma essendo minorenne hai il diritto al 20% di sconto");
            ticketSale = ( (fullPrise - (fullPrise * rateChildren) / 100) );
            System.out.println("Quindi dei pagare: ");
            System.out.println(ticketSale);
        }
        if (agePassenger >= ageRequireOlder) {
            // if you are old
            System.out.println("Ma essendo vecchio hai il diritto al 40% di sconto");
            ticketSale = ( (fullPrise - (fullPrise * rateOlder) / 100) );
            System.out.println("Quindi dei pagare: ");
            System.out.println(ticketSale);
            ticketPrise= 0;
        }

    }
}
