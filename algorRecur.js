/*1 уровень сложности: Реализуйте в виде кода, текста или псевдокода одно из следующих заданий на выбор:

public static int countConsonantIteration(String str) {
   int count = 0;
   for (int i = 0; i < str.length(); i++) {
       if (isConsonant(str.charAt(i))) {
           count++;
       }
   }
   return count;
}

Реализовать метод countConsonantRecursion(str, strLength)
Для решения использовать рекурсивный подход
*/
let count = 0;
function strLen(str) {
   let len = str.length;
    if (len > 0) {
        let str1 = str.substring(1);
        count++
        strLen(str1);       
    };
}
strLen("ggdgjldyvvf");
console.log(count); //11
