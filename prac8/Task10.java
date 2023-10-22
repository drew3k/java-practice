package prac8;

import java.util.Scanner;

public class Task10 {
    public static int reverse(int n) {
        if (n < 10) {
            return n;
        } else {
            int lastDigit = n % 10;
            int remainingDigits = n / 10;
            int reversed = reverse(remainingDigits);
            int orderOfMagnitude = (int) Math.pow(10, (int) Math.log10(remainingDigits) + 1);
            return lastDigit * orderOfMagnitude + reversed;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число (без нулей): ");
        int n = scanner.nextInt();
        scanner.close();

        int reversed = reverse(n);
        System.out.println("Число в обратном порядке: " + reversed);
    }
}
