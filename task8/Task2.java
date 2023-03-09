package task8;

public class Task2 {
    public static void main(String[] args) {

        int n = 4;
        int k = 6;

        int[] array = {1, 5, 7, 1};
        int sumOfPayers = 0;


        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == k) {
                    System.out.println(array[i] + " + " + array[j] + " = " + k);
                    sumOfPayers++;

                }

            }
        }
        System.out.println("Количество пар: " + sumOfPayers);

    }
}
