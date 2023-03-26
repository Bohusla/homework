public class UtilString {
    public static void main(String[] args) {

//        String first = "Hello";
//        String second = "World";
        String s1 = UtilString.concatAndReverse("Hello ", "World ");
        System.out.println(s1);


        System.out.println(UtilString.getReversLine("I Like Java"));

      }


     public static String concatAndReverse(String first, String second){
       String result = second.concat(first).toUpperCase();

       return result;
     }



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
