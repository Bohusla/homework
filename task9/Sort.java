package task9;

public class Sort {



//    Способ сортировки вставками:
//    Этот алгоритм разделяет оригинальный массив на сортированный и несортированный подмассивы.
//    Длина сортированной части равна 1 в начале и соответствует первому (левому) элементу в массиве.
//    После этого остается итерировать массив и расширять отсортированную часть массива одним элементом
//    с каждой новой итерацией.
//
//
//    После расширения новый элемент помещается на свое место в отсортированном подмассиве.
//    Это происходит путём сдвига всех элементов вправо, пока не встретится элемент,
//    который не нужно двигать.



        public static void insertionSort ( int[] array){

            for (int i = 1; i < array.length; i++) {
                int current = array[i];
                int j = i - 1;
                while (j >= 0 && current < array[j]) {
                    array[j + 1] = array[j];
                    j--;
                }
                array[j + 1] = current;
            }
        }




//    Способ сортировки выбором:
//    Сортировка выбором тоже разделяет массив на сортированный и несортированный подмассивы.
//    Но на этот раз сортированный подмассив формируется вставкой минимального элемента
//    не отсортированного подмассива в конец сортированного, заменой.
//    В каждой итерации вы предполагаете, что первый неотсортированный элемент минимален
//    и итерируете по всем оставшимся элементам в поисках меньшего.
//    После нахождения текущего минимума неотсортированной части массива вы меняете его местами
//    с первым элементом, и он уже часть отсортированного массива


        public static void selectionSort ( int[] array){

            for (int i = 0; i < array.length; i++) {
                int min = array[i];
                int minId = i;
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] < min) {
                        min = array[j];
                        minId = j;
                    }
                }


                int temp = array[i];
                array[i] = min;
                array[minId] = temp;
            }

        }
    }
