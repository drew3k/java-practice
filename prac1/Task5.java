package prac1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число для вычисления факториала: ");
        int n = scanner.nextInt();

        long factorial = calculateFactorial(n);

        System.out.println("Факториал числа " + n + " = " + factorial);
    }

    static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
