package algorytmy;

import java.util.Scanner;

public class Dividers {
    public static void main(String[] args) {
        Scanner sr2 = new Scanner(System.in);
        System.out.println("Podaj dana liczbe: ");
        int divider = sr2.nextInt();
        System.out.println(sumDividers(divider));
    }
    private static int sumDividers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                sum += i;
        }
        return sum;
    }
}
