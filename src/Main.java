import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //Задача 1
    public static void checkLeapYear (int year) {
        if (year > 1584 && ((year % 4 == 0 && year % 100 > 0) || year %400 == 0 )) {
            System.out.println(year +" год является високосным");
        } else {
            System.out.println(year +" год не является високосным");
        }
    }
    //Задача 2
    public static void checkOSAndSystemYear (int clientOS,int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 1) {
            if (clientDeviceYear <= currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientDeviceYear <= currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    //Задача 3
    public static void checkDeliveryTime (int deliveryDistance) {
        if (deliveryDistance <= 20) {
            System.out.println("Для доставки потребуется дней: " + 1);
        }
        else if (deliveryDistance > 20 && deliveryDistance <=60) {
            System.out.println("Для доставки потребуется дней: " + 2  );
        }
        else if (deliveryDistance > 60 && deliveryDistance <=100) {
            System.out.println("Для доставки потребуется дней: " + 3);
        }
        else {
            System.out.println("Доставки нет");
        }
    }
    public static void main(String[] args) {
        System.out.println(' ');
        System.out.println("задача 1");
        System.out.println(' ');
        checkLeapYear(2025);
        System.out.println(' ');
        System.out.println("задача 2");
        System.out.println(' ');
        checkOSAndSystemYear(1,2015);
        System.out.println(' ');
        System.out.println("задача 3");
        System.out.println(' ');
        checkDeliveryTime(50);
    }
}