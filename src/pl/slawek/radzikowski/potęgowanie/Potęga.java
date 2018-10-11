package pl.slawek.radzikowski.potęgowanie;

import java.util.Scanner;

public class Potęga {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);


        int podanaLiczba,potega,wynik=1;

        System.out.println("Podaj liczbę ");
        podanaLiczba =sc.nextInt();
        System.out.println("Podaj potęgę ");
        potega=sc.nextInt();

        //potęgowanie przy pomocy pętli while:
        while (potega>0){
            wynik*=podanaLiczba;
            potega--;
        }
        System.out.println(wynik);

        //wersja z Math.pow

        int wynik2;

        wynik2=(int)Math.pow(podanaLiczba,potega);  //zrzutowanie do inta, bo chce doubla
        System.out.println("Wynik potęgowania wynosi: "+wynik2);

    }
}
