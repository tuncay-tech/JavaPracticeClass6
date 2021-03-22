import java.util.Scanner;

public class soru03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yil yaziniz");
        int yil = scan.nextInt();

        boolean sonuc = isLeap(yil);
        if (isLeap(yil) == true) {
            System.out.println(yil + "bir artık ıldır");
        } else {
            System.out.println(yil + "artık bir yıl değildir");
        }
    }

    public static boolean isLeap(int yil) {
        boolean isLeap = false;
        if (yil % 4 == 0) {
            if (yil % 100 == 0) {
                if (yil % 400 == 0) {
                    isLeap = true;
                } else {
                    isLeap = false;
                }

            } else {
                isLeap = false;
            }

        } else {
            isLeap = false;
        }

        return isLeap;
    }
}
