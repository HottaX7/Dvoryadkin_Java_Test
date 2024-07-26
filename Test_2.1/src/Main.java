import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите значение a");
        int a = scan.nextInt();
        System.out.println("Введите значение b");
        int b = scan.nextInt();
        System.out.println("Результат сложения");
        System.out.println(a + b);
        System.out.println("Результат вычитания");
        System.out.println(a - b);
        System.out.println("Результат деления");
        System.out.println(a / b);
        System.out.println("Результат умножения");
        System.out.println(a * b);
        if (a < b) {
            System.out.println("a меньше b");
        } else if (a > b) {
            System.out.println("a больше b");
        } else {
            System.out.println("a равно b");
        }
    }
}
