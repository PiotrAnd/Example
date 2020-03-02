package algorytmy;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("Give number: ");
        int number = sr.nextInt();
        double sum = 0;
        double average = 0;
        for (int i = 0; i <= number; i++)
        sum+=i;
        System.out.println("The sum is: " + sum);
        average= sum / number;
        System.out.println("The arithmetic mean is: " + average);
    }
}

