package lesson5;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int enteredNumber;

        do {
            System.out.println("Введите целое число больше 1: ");
            enteredNumber = scanner.nextInt();
        } while (enteredNumber < 1);

        System.out.println("Список всех простых чисел в диапазоне от 2 до " + enteredNumber + ":");

        for (int i = 2; i <= enteredNumber; i++) {
            boolean isPrimeNumber = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }

            if (isPrimeNumber) {
                System.out.println("");
            }
        }
    }
}