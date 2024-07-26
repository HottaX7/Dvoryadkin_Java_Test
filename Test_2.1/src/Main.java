import java.util.Scanner;

public class Main {
    public Main() {

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод двух целых чисел
        System.out.print("Введите первое целое число (a): ");
        int a = scanner.nextInt();
        System.out.print("Введите второе целое число (b): ");
        int b = scanner.nextInt();

        // Сравнение чисел
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        // Арифметические операции
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        double quotient;

        // Проверка деления на ноль
        if (b != 0) {
            quotient = (double) a / b;
        } else {
            quotient = Double.NaN; // "не число", обозначение ошибки деления на ноль
        }

        // Вывод результатов арифметических операций
        System.out.println("Сумма: " + a + " + " + b + " = " + sum);
        System.out.println("Разность: " + a + " - " + b + " = " + difference);
        System.out.println("Умножение: " + a + " * " + b + " = " + product);
        if (b != 0) {
            System.out.println("Деление: " + a + " / " + b + " = " + quotient);
        } else {
            System.out.println("Деление: " + a + " / " + b + " = деление на ноль невозможно");
        }

        scanner.close();
    }
}