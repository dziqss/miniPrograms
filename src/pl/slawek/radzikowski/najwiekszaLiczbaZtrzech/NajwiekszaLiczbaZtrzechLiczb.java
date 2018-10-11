/*
  Program wyznaczający największą z podanych 3 liczb.

 */

package pl.slawek.radzikowski.najwiekszaLiczbaZtrzech;

public class NajwiekszaLiczbaZtrzechLiczb {
    public static void main(String[] args) {

        int a=9;
        int b=0;
        int c=8;

        double arytm =(a+b+c)/3;

        if (c>b &&a>c){
            System.out.println(a);
        }else if (b>c){
            System.out.println(b);
        }else
            System.out.println(c);

        System.out.println("Suma Twoich liczb wynosi: "
                +(a +b +c));
        System.out.println("Średnia arytmetyczna tych liczb wynosi: " +arytm);

    }
}
