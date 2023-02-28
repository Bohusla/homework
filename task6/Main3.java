package task6;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        int number;
        int summa;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите трехзначное число");
        number = scanner.nextInt();





        if (number > 0 && number < 1000){
            int a = number % 10;
            int b = number / 10 % 10;
            int c = number / 100;
            summa = a + b + c;

            System.out.println("Сумма цифр числа " + number +" равна " + summa);
        }else {System.out.println("Число не соответствует ожидаемым параметрам");
        }

    }
}
