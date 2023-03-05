package task7;

public class Lift {

    //Сломанный лифт
    //Лифт, находящийся на первом этаже здания высотой H, должен подняться на последний этаж. Лифт сломан.
    // Каждый раз он поднимается на N этажей и спускается на M этажей. Если на последнем подьеме лифт превысил количество этажей,
    // то считается что лифт поднялся на самый верх. Найдите количество подьемов, которые понадобятся лифту.
    //Пример начальных данных:
    //H = 200, N = 50, M = 1
    //Ответ: 5
    //Объяснение:
    //Первый подьем: 50 - 1 = 49
    //Второй подьем: 49 + 50 - 1 = 98
    //Третий подьем: 98 + 50 - 1 = 147
    //Четвертый подьем: 147 + 50 - 1 = 196
    //Пятый подьем: выйти за пределы H.


    //Реализовать метод numberOfLifts(int floors, int stepUp, int stepDown)
    //Метод должен быть универсальным, то есть корректно работать с любым набором входных данных.

    public static void main(String[] args) {

        Lift lift = new Lift();

        lift.Count(200, 50, 1);
        System.out.println(lift.countStep);
    }


    int countStep;



    public void Count(int floors, int stepUp, int stepDown) {
        int myFloors = 1;

        do

    {
        myFloors = myFloors + stepUp - stepDown;
        countStep = countStep + 1;
    }

        while(myFloors <= floors);

}
}



