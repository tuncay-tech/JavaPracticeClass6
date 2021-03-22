import java.util.Scanner;

public class soru02 {
    public static void main(String[] args) {
        int sayi = 0;
        String  rakamAdi;
        Scanner girdi = new Scanner(System.in);
        System.out.println("Sayı girin:");
        sayi = girdi.nextInt();
        switch (sayi) {
            case 1:
                rakamAdi ="Bir";
                System.out.print("Rakam Adı :"+rakamAdi);
                break;
            case 2:
                rakamAdi ="iki";
                System.out.print("Rakam Adı :"+rakamAdi);
                break;
            case 3:
                rakamAdi ="Üç";
                System.out.print("Rakam Adı :"+rakamAdi);
                break;
            case 4:
                rakamAdi ="Dört";
                System.out.print("Rakam Adı :"+rakamAdi);
                break;
            case 5:
                rakamAdi ="Beş";
                System.out.print("Rakam Adı :"+rakamAdi);
                break;
            case 6:
                rakamAdi ="Altı";
                System.out.print("Rakam Adı :"+rakamAdi);
                break;
            case 7:
                rakamAdi ="Yedi";
                System.out.print("Rakam Adı :"+rakamAdi);
                break;
            case 8:
                rakamAdi ="Sekiz";
                System.out.print("Rakam Adı :"+rakamAdi);
                break;
            case 9:
                rakamAdi ="Dokuz";
                System.out.print("Rakam Adı :"+rakamAdi);
                break;
            case 0:
                rakamAdi ="Sıfır";
                System.out.print("Rakam Adı :"+rakamAdi);
                break;
            default:
                System.out.print("Sayı bulunamadı");
    }
}
}