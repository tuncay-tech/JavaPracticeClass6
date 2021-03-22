import java.util.HashMap;
import java.util.Scanner;

public class soru07 {  // hocanın yaptığı

    // deger : kitap adı, yazarı, yayınlanma tarihi
    static int id=1000;
    static String ad;
    static String yazar;
    static String yayinTarihi;
    static HashMap<Integer,String> kitaplar = new HashMap<>();
    public static void main(String[] args) {
        kitaplar.put(id,"Beyaz Gemi - Cengiz - 2000");
        id++;
        kitaplar.put(id,"1984 - GeorgeOrwell - 1945");
        id++;
        menu();
    }
    public static void menu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("1 - Kitap eklemek\n2 - Listeleme\n3 - Kitap Silme\n4 - Bilgiye gore Kitap arama\n5 - Id ile Kitap Arama");
        byte secenek = scan.nextByte();
        switch (secenek) {
            case 1: ekle(); break;
            case 2: Listele(); break;
            case 5: bulBy_Id(); break;
        }
    }
    public static void bulBy_Id() {
        int istenenId=0;
        String bulunanKitap ="";
        Scanner scan = new Scanner(System.in);
        System.out.print("Bulunmasını istedigin id yi gir: ");
        istenenId = scan.nextInt();
        if(kitaplar.isEmpty()) {
            System.out.println("Hic kitap yok");
        } else if(kitaplar.containsKey(istenenId)){
            bulunanKitap = kitaplar.get(istenenId);
            System.out.println("Aradıgınız kitap : " + bulunanKitap);
        } else {
            System.out.println("Bu id bilgisine sahip kitap bulunmamaktadır");
        }
        menu();
    }
    //Ekleme fonksiyonu yapıyor String degerler alacagız ve hashmap e keleyecegiz
    public static void ekle() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kitabın ismi: ");
        ad = scan.nextLine();
        System.out.println("Kitabın yazarı: ");
        yazar = scan.nextLine();
        System.out.println("Kitanın yayınlanma tarihi: ");
        yayinTarihi = scan.next();
        String kitapInfo = ad + " - " + yazar + " - " + yayinTarihi ;
        kitaplar.put(id++,kitapInfo);
        menu();
    }
    //Var olan kitaplar hasmap ne varsa yazdıralım
    public static void Listele() {
        for (Integer key : kitaplar.keySet()) {
            System.out.println(key + ":" + kitaplar.get(key));
        }
        menu();
    }
}
