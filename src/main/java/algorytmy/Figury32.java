package algorytmy;

import java.util.Scanner;

public class Figury32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę n: ");
        int n = scanner.nextInt();
        printtirangle(n);
        printSquare(n);
        printRamp(n);
        drawX(n);
    }

    private static void drawX(int n) {
        for (int i = 0; i< n;i++){
            System.out.println(" ");
            for (int j = 0; j<n;j++){
                System.out.print(" ");
                if ((i==j)||(i+j+1==n)){
                    System.out.print("*");
            }
        }
    }
    }

    private static void printRamp(int n) {
        System.out.println();
        for (int i = 0; i< n;i++){
            for (int j = 0; j<n;j++){
                if (j==i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    private static void printSquare(int n) {
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                if ((i == 0) || (i == n - 1))
                    System.out.print("*");
                else if ((j == 0) || (j == n - 1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            System.out.println();
        }
    }

    private static void printtirangle(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (i >= j)
                    System.out.print("*");
            }
            System.out.println();

        }
    }
}
