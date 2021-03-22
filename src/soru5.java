import java.util.Scanner;

public class soru5 {
    public static void main(String[] args) { // metodla başka bir çözüm
        int year;
        Scanner girdi = new Scanner(System.in);
        System.out.println("Bir yıl giriniz :");
        year = girdi.nextInt();
        leapYear(year);
    }

    public static void leapYear(int year) {
        if (0 == year % 4 && year % 100 == 0) {
            System.out.println("girilen yıl artık yıl değildir");
        } else if (year % 4 == 0) {
            System.out.println("girilen yıl artık yıldır");
        } else {
            System.out.println("girilen yıl artık yıl değildir");
        }
    }
}
