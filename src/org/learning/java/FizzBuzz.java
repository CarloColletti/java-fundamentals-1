package org.learning.java;

import java.util.Scanner;

public class FizzBuzz {

    /** Consegna: Scrivi un programma che stampi i numeri da 1 a 100,
     * ma per i multipli di 3 stampi “Fizz”
     al posto del numero e per i multipli di 5 stampi “Buzz”. Per i numeri che sono sia multipli di 3 che di 5 stampi “FizzBuzz”.
       Esempio: 1 2 Fizz 4 Buzz Fizz 7 8 Fizz……
       Bonus: invece che 100, chiedere all’utente quanti numeri vuole stampare (il valore inserito dall’utente deve essere maggiore di 0 e minore di 1000)
    */

    public static void main(String[] args) {
        // create scan variable
        Scanner numbersSelected = new Scanner(System.in);

        // Request number
        System.out.println("Inserisci dino a che numero vui arrivare");
        int numberList = numbersSelected.nextInt();

        // number rewritable
        int number;

        //cycle
        for (int i = 0; i < numberList; i++) {
            // increment to skip the zero
            number = i+1;

            if ( number % 3 == 0 && number % 5 == 0 ){
                // see is equal to 3
                System.out.println(number + " FizzBuzz");
            } else if ( number % 5 == 0 ) {
                // see is equal to 5
                System.out.println(number + " Buzz");
            } else if (number % 3 == 0) {
                // see is equal to 3 && 5
                System.out.println(number + " Fizz");
            }else {
                // other numbers
                System.out.println(number);
            }


        }


    }
}
