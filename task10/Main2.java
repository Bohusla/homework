package task10;


//                 Дан массив символов, объедините его в строку
//                 и замените символ '?' на правильный символ,
//                 выведите результат на консоль.
//         char[] arr = {'I', ' ', 'l', 'i', 'k', '?', ' ', 'J', 'a', 'v', 'a'};
//         Попытайтесь решить данное задание двумя разными способами.


import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {

        char[] arr =  {'I', ' ', 'l', 'i', 'k', '?', ' ', 'J', 'a', 'v', 'a'};


            String s = Arrays.toString(arr);

        System.out.println(s);


String f = "?";
        System.out.println(s.indexOf(f));

        //к сожалению не рвзобралась

        }
    }

