package algorytmy;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int podanaLiczba = sr.nextInt();
        boolean pierwsza = true;
        if (podanaLiczba < 2) {
            return;
        }
        for (int i = 2; i <= podanaLiczba / 2; i++)//for(int i=2;i*i<=podanaLiczba
            if (podanaLiczba % i == 0)
                pierwsza = false;
        if (pierwsza)
            System.out.println("Liczba " + podanaLiczba + " jest liczbą pierwszą.");
        else
            System.out.println("Liczba " + podanaLiczba + " nie jest liczbą pierwszą.");
    }
}


