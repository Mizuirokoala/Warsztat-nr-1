package Warsztat_1;

import java.util.Random;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {

        Scanner skan = new Scanner(System.in);
        Random secret = new Random();
        int proba = 0;
        int strzal = 0;

        int wylosowanaLiczba = secret.nextInt(101000);
        System.out.println("Losuje liczbe z zakresu od 0 do 100 ");

        while (strzal != wylosowanaLiczba) {
            System.out.println("Zgadnij jaka to liczba: ");
            strzal = skan.nextInt();
            proba++;
            if (strzal < wylosowanaLiczba) {
                System.out
                        .println("Podaj większą liczbę");
            } else if (strzal > wylosowanaLiczba) {
                System.out.println(
                        "Podaj mniejszą liczbę");
            } else if (strzal == wylosowanaLiczba) {
                System.out.println("Bravo!Zgadles w probie: " + proba);
            }
        }
    }
}
