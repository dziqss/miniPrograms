package pl.slawek.radzikowski.liczbaLosowa;

public class LiczbaLosowa {
    public static void main(String[] args) {


        int losowaLiczba =(int)(Math.random()*30);
        if (losowaLiczba<=17){
            System.out.println("Liczba wynosi: " + losowaLiczba + ". Jest mniejsza lub rowna 17");
        }else{
            System.out.println("Liczba wynosi więcej niż 17. Wylosowana liczba to: "+losowaLiczba);
        }
    }
}
