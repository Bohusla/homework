package task10;

//                Напишите метод, который
//                в качестве входящего параметра принимает строку
//                и выводит данную строку в консоль, но со словами,
//                отображёнными в обратном порядке.
//        Пример:
//        Входная строка - "I like Java"
//        Вывод в консоль - "I ekil avaJ"

public class Main3 {
    public static void main(String[] args) {

        String input = "I like Java";
       char[] inputChar = input.toCharArray();
       char[] outputChar = new  char[input.length()];


        for (int i = 0; i < input.length(); i++) {

         outputChar[i] = inputChar[input.length() - (i+1)];

        }
        System.out.println(outputChar);
        String k;


    }
    }

