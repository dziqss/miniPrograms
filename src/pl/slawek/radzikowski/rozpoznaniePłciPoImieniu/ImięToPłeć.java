/*Program rozpoznaje imię. Jeśli kończy się na "a" to wyświetla powitanie dla kobiety.
 */

package pl.slawek.radzikowski.rozpoznaniePłciPoImieniu;

import java.util.Scanner;

public class ImięToPłeć {
    public static void main (String [] args){

        Scanner in = new Scanner(System.in);

        String imie;
        System.out.println("Twoje imie ");
        imie = in.nextLine();

        if (imie.endsWith("a")) {
            System.out.println("Witam Panią. "+ imie + " to fajne imię");
        } else {
            System.out.println("Witam Pana. " +imie +" jest OK !:)");
        }


    }
}
