package task4;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input word 1 (6 symbol)");
        String wordOne = scanner.nextLine();
        System.out.println("input word 2 (6 symbol)");
        String wordTwo = scanner.nextLine();
        System.out.println("new word is " + wordOne.substring(0, 3)+wordTwo.substring(3, 6));

        System.out.println("input number 1");
        int numberOne = scanner.nextInt();
        System.out.println("input number 2");
        int numberTwo = scanner.nextInt();
        int firstResult = addTwoNumber(numberOne,numberTwo);
        System.out.println("summa "+firstResult);

        int secondResult = minusTwoNumber(numberOne,numberTwo);
        System.out.println("minus "+ secondResult);

        int thirdResult = multiTwoNumber(numberOne,numberTwo);
        System.out.println("multiplication = "+thirdResult);

        double forthResult = divTwoNumber(numberOne,numberTwo);
        System.out.println("division " + forthResult );



        System.out.println("input money (Euro)" );
        double summaEuro = scanner.nextDouble();
        double summaDollar = Euro(summaEuro);
        System.out.println("Dollar "+summaDollar);

        System.out.println("pizza diameter 28");
        double  plusKal = plusKalory(28);
        System.out.println("on " +plusKal+ " mehr kallory");



    }
    private static int addTwoNumber(int a,int b) throws NullPointerException {
        int result = a + b;
        return result;
    }
    private static int minusTwoNumber(int a,int b) throws NullPointerException {
        int result = a - b;
        return result;
    }
    private static int multiTwoNumber(int a, int b) throws NullPointerException {
        int result = a * b;
        return result;
    }
    private static double divTwoNumber(int a, int b) throws NullPointerException {
        double result = a/b;
        return result;
    }
    private static double Euro(double a) throws NullPointerException {
        double kurs = 1.07;
        double result = a * kurs;
        return result;
    }
    private static double plusKalory(int b) throws NullPointerException {

        double result = 3.14 * 40 * (b * b - 144);
        return result;

    }

}
