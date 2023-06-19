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

//Uncaught RangeError: Maximum call stack size exceeded

Реализовать метод countConsonantRecursion(str, strLength)
Для решения использовать рекурсивный подход


ИЛИ


Ханойская башня
Задача заключается в следующем. Имеется три стержня — левый, средний и правый. 
На левом стержне находятся n дисков, диаметры которых различны.
 Диски упорядочены по размеру диаметра, сверху лежит наименьший, снизу — наибольший. 
 Требуется перенести диски с левого стержня на правый, используя средний стержень как вспомогательный.
Головоломка имеет следующие два правила:
      1. Вы не можете поместить больший диск на меньший диск.
      2. За один раз можно перемещать только один диск.
Реализуйте два подхода для решения.
Итеративно
Рекурсивно
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