package pl.slawek.radzikowski.operacjeMatematyczne;

public class PlusMinusDzielMnozModulo {
    public static void main(String[] args) {


        int z1 = 15;
        int z2 = 7;

        System.out.println("15+7= " + (z1 + z2));
        //dodawanie

        System.out.println("15-7= " + (z1 - z2));
        //odejmoowanie

        System.out.println("15*7= " + (z1 * z2));
        //mnozenie

        System.out.println("15/7= " + (z1 / z2));
        //dzielenie

        System.out.println("15%7= " + (z1 % z2));
        //modulo, reszta z dzielenia(np 7/2=3.5, reszta daje nam 1)
    }
}
