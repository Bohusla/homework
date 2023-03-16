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


       
        String s = new String(arr);  // перевели масив символов в строку
        String f = "?";
        int n = s.indexOf(f);
        String s1 = s.substring(0, n)+"e";
        String s2 = s.substring(n+1, s.length());


        System.out.println(s1.concat(s2));

     

        }
    }

