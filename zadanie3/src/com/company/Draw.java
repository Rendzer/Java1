package com.company;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Draw {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random generator = new Random();
        int attempt = 0;
        int strzal = 0;
        boolean again = false;
        String continueGame = "";
        int wylosowanaLiczba = generator.nextInt(101);
        System.out.println("Losuje liczbe z zakresu od 0 do 100 ");
        try {

                while (strzal != wylosowanaLiczba) {
                    while (true) {
                    //do {
                    //while (continueGame == "y") {
                        System.out.println("Zgadnij jaka to liczba: ");
                        strzal = input.nextInt();
                        attempt++;
                        if (strzal < wylosowanaLiczba) {
                            System.out.println("Niestety, to za malo. Podaj wieksza liczbe");
                        } else if (strzal > wylosowanaLiczba) {
                            System.out.println(
                                    "Podana liczba to za duzo. Podaj mniejsza liczbe");
                        } else if (strzal == wylosowanaLiczba) {
                            System.out.println("Congratulations! You found this number in: " + attempt + " attempt(s).");
                            System.out.println("Do You want to continue this game? y - yes");
                            attempt = 0;
                            strzal = 0;
                            wylosowanaLiczba = generator.nextInt(101);
                            continueGame = input.next();
                        }
                    }
                    //} while (continueGame != "y");
                }

        } catch (InputMismatchException error) {    // Inny podobny przykład dotyczy sytuacji, gdy wykorzystujemy metody Scannera dedykowane do wczytywania liczb, np. nextInt(). Wtedy wyjątek zostaje przechwycony i zamiast niego rzucany jest InputMismatchExcetpion
            System.out.println("Error");
        }
        input.close();
    }
}
