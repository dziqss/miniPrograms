/* Program wypisujący liczby od 1 do 100 (lub w innej kombiinacji):
 */
package pl.slawek.radzikowski.sprzedażUżywek;

import java.util.Scanner;

public class Używki {

    //Program sprawdzający wiek kupującego używkę.

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Co chcesz kupić?");
        String towar = in.nextLine();

        if (towar.contains("piwo") || towar.contains("papierosy")) {
            System.out.println("Muisz podac swoj wiek");

            int wiek = in.nextInt();

            if (wiek < 18) {

                System.out.println("Zakaz sprzedaży. Osoba niepełnoletnia");

            } else {
                System.out.println("Sprzedano " + towar);
            }

        } else {

            System.out.println("Sprzedano " + towar);

        }
    }
}
