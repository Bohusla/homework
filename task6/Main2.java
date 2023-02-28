package task6;

import java.util.Random;

public class Main2 {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100, 1000);

//        for (int i = 0; i< 20; i++){
//            System.out.println();

//        int a = number % 10;
//        int b = number / 10 % 10;
//        int c = number / 100;
        int max =0;
        System.out.println(number);

//        if (a > b && a > c){
//            max = a;
//        }else if (b > a && b > c){
//            max=c;
//        }else{
//            max=c;
//        }
        while (number !=0){                  //857 !=0 true  /65 !=0 true   /8 !=0 true   /0 !=0 false
            int d = number%10;               //7             /5             /8
            if (d>max){                      //7             / 7            / 8
                max=d;

            }
            number = number / 10;            //85           /8             /0
        }

        System.out.println(max);
    }
}
