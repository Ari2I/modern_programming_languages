package practice_2;

import java.util.Scanner;

public class task5 {


    public static void calculateSpeed() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Функция нахождения скорости");
        System.out.print("Введите время: ");
        double imp_time = scanner.nextDouble();
        System.out.print("Введите расстояние: ");
        double imp_distance = scanner.nextDouble();

        while (imp_distance <= 0) {
            System.out.println("Расстояние не может быть отрицательным! Введите новое расстояние:");
            imp_distance = scanner.nextDouble();
        }

        while (imp_time <= 0) {
            System.out.println("Время не может быть отрицательным! Введите новое время:");
            imp_time = scanner.nextDouble();
        }
        double speed = imp_distance / imp_time;

        System.out.print(speed);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("\n--- ГЛАВНОЕ МЕНЮ ---");
            System.out.println("1. Выполнить расчёт скорости");
            System.out.println("2. Выход");
            System.out.print("Выберите пункт меню: ");

            String choice = scanner.next();

            switch (choice) {
                case "1":
                    calculateSpeed();
                    break;

                case "2":
                    System.out.println("\nВыход из программы. До свидания!");
                    isRunning = false;
                    break;

                default:
                    System.out.println("\nОшибка: Неверный пункт меню! Выберите от 1 до 4.");
                    break;
            }
        }
        scanner.close();
    }
}