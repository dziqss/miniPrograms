package pl.slawek.radzikowski.obliczaniePolaKola;

public class PoleKoła {
    public static void main(String[] args) {

        // pole koła pi*r^2 -> pi*r*r, obwód koła 2*pi*r

        double pi = 3.14;
        int r = 47; // promień koła

        System.out.println("Pole kola= " + (pi * r * r));
        System.out.println("Obwod kola= " + (2 * pi * r));

    }
}
