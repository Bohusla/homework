package task10;

public class Main {
    public static void main(String[] args) {

//        String first = "Hello";
//        String second = "World";
        String s1 = Main.concatAndReverse("Hello ", "World ");
        System.out.println(s1);

        char[] arr =  {'I', ' ', 'l', 'i', 'k', '?', ' ', 'J', 'a', 'v', 'a'};
        String s = new String(arr);
        System.out.println(s.replace("?", "e"));


        System.out.println(Main.getReversLine("I Like Java"));

    }


    public static String concatAndReverse(String first, String second){
        String result = second.concat(first).toUpperCase();

        return result;
    }




//        System.out.println(s.replace("?", "e"));

    public static String getReversLine (String str){

        StringBuilder sortStr = new StringBuilder();
        String strRev = new String();
        String[] arrayStr = new StringBuilder(str).reverse().toString().split(" ");

        for (int i = arrayStr.length - 1; i >= 0 ; i--) {
            sortStr.append(arrayStr[i]).append(" ");
            strRev = sortStr.toString();


        }
        return strRev;

    }


}


