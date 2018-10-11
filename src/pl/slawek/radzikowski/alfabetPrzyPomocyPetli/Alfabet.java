package pl.slawek.radzikowski.alfabetPrzyPomocyPetli;

public class Alfabet {

        public static void main(String[] args) {

            //ALFABET PRZY POMOCY DWOCH PETLI : WHILE I FOR :)
            char m = 'a';
            //f--;
            while (m <= 'z') {
                System.out.println("alfabet a-z : " + m);
                m++;
            }
            for (char o = 'a'; o <= 'z'; o++) {
                System.out.print(o);
            }
        }
    }
