package pl.slawek.radzikowski.silnia;

public class Silnia {
    public static void main(String[] args) {

        //wyliczanie silni za pomoca petli, n! =1*2*3 .. *n

        int g = 5;
        long silnia = 1;


        for (int i = 1; i <= g; i++) {
            silnia = silnia * i;
        }
        {
            System.out.println("Silnia z " + g + " wynosi odpowiednio " + silnia);
        }

    }
}
