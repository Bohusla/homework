        /* 09.06: Имея два отсортированных массива размера m и n соответственно,
        вам нужно найти элемент, который будет находиться на k-й позиции в конечном отсортированном массиве.
        Массив 1 - 100 112 256 349 770
        Массив 2 - 72 86 113 119 265 445 892
        к = 7
        Вывод : 256
        Окончательный отсортированный массив -
        72, 86, 100, 112, 113, 119, 256, 265, 349, 445, 770, 892
        7-й элемент этого массива равен 256.*/

        let arr1 = [100, 112, 256, 349, 770];
        let arr2 = [72, 86, 113, 119, 256, 445, 892];
        let k = 7;
        let arrResult = arr1.concat(arr2);
        arrResult = arrResult.sort((a, b) => a - b);
        console.log(arrResult[k - 1]);