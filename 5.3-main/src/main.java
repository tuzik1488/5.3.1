public class main {
    public static void main(String[] args) {
        int a = 120;
        int b = 60;

        if (a < 25 || a > 100) {
            System.out.println("Число 120 не міститься у проміжку (25; 100)");
        } else {
            System.out.println("Число 120 міститься у проміжку (25; 100)");
        }

        if (b > 25 && b < 100) {
            System.out.println("Число 60 міститься у проміжку (25; 100)");
        } else {
            System.out.println("Число 60 не міститься у проміжку (25; 100)");
        }



        int number = 772;
        int hundred = number / 100;
        int ten = (number / 10) % 10;
        int one = number % 10;

        if (hundred > ten && hundred > one) {
            System.out.println("Найбільша цифра - " + hundred);
        } else if (ten > hundred && ten > one) {
            System.out.println("Найбільша цифра - " + ten);
        } else if (one > hundred && one > ten) {
            System.out.println("Найбільша цифра - " + one);
        } else if (hundred == ten && ten == one) {
            System.out.println("Всі цифри однакові");
        } else {

            if (hundred == ten) {
                System.out.println("Найбільша цифра - " + hundred);
            } else if (hundred == one) {
                System.out.println("Найбільша цифра - " + hundred);
            } else if (ten == one) {
                System.out.println("Найбільша цифра - " + ten);
            }
        }

        int floor_1 = 9;
        int floor_2 = 7;
        if (floor_1 <= 9 && floor_2 <= 9) {
            if (floor_1 < floor_2 && floor_2 == 2) {
                System.out.println("Ви піднялись на 3 поверх");
            } else if (floor_1 > floor_2 && floor_2 == 2) {
                System.out.println("Ви опустились на 1 поверх");
            } else if (floor_1 < floor_2) {
                System.out.println("Ви піднялись на " + floor_2 + " поверх");
            } else {
                System.out.println("Ви опустились на " + floor_2 + " поверх");
            }
        }
        else {
            System.out.println("Ви ввели не правильний поверх");
        }

        String abc = "Yes";

        switch (abc) {
            case ("OK"):
            case ("Так"):
            case ("ОК"):
            case ("Ok"):
            case ("Yes"):
            case ("+"):
            case ("Y"):
                System.out.println("Я погоджуюсь!");
                break;
            case ("No"):
            case ("-"):
            case ("N"):
            case ("Ні"):
            case ("NO"):
                System.out.println("Я не погоджуюсь!");
                break;
        }
    }
}

