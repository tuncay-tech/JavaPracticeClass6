import java.util.Scanner;

public class soru01 {
    public static void main(String[] args) {
        //Klavyeden girilen rakamın adını yazdırna program

        Scanner girdi = new Scanner(System.in);
        System.out.println("rakam giriniz>>");
        int num = girdi.nextInt();

        if (num>=0 && num>10){
                switch (num){
                    case 0: System.out.print("sıfır");break;
                    case 1: System.out.print("bir");break;
                    case 2: System.out.print("iki");break;
                    case 3: System.out.print("üç");break;
                    case 4: System.out.print("dört");break;
                    case 5: System.out.print("beş");break;
                    case 6: System.out.print("altı");break;
                    case 7: System.out.print("yedi");break;
                    case 8: System.out.print("sekiz");break;
                    case 9: System.out.print("dokuz");break;
                }
        }
        else {
            System.out.println("girilen değer bir rakam değildir");
        }

    }
}
