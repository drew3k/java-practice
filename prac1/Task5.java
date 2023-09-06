package prac1;

import java.math.BigInteger;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число для вычисления факториала: ");
        int n = scanner.nextInt();

        BigInteger factorial = calculateFactorial(n);

        System.out.println("Факториал числа " + n + " = " + factorial);
    }

    static BigInteger calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return BigInteger.ONE;
        }
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
