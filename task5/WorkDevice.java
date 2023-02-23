package task5;

public class WorkDevice {
    public static void main(String[] args) {


        int temperature1 = 20;
        int temperature2 = 60;

            boolean isWorkDevise;
            boolean t1;
            boolean t2;
            if (temperature1 > 100) {
                t1 = true;
            } else {
                t1 = false;
            }
            if (temperature2 < 100) {
                t2 = true;
            } else {
                t2 = false;
            }

            isWorkDevise = t1 && t2;

            System.out.println("устройство работает: "+ isWorkDevise);

        }
}
