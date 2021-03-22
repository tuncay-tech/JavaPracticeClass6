import sun.nio.ch.sctp.SctpStdSocketOption;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class soru06 {  // benim yaptığım
    // değer: kitap adı, yazarı, yayın tarihi,,
    static int id = 1000;
    static String ad;
    static String yazar;
    static String yayinTarihi;

    static HashMap<Integer, String> kitaplar = new HashMap<>();   // ilk önce hash map tanımlayacağız

    public static void main(String[] args) {

        kitaplar.put(id, "beyaz gemi - cengiz -2000");
        id++;
        kitaplar.put(id, "1984 - geroge orwel - 1945");
        id++;

        menu();

    }

    public static void menu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("1 - kitap eklemek \n2 - listeleme\n3 - kitap silme \n4- bilgiye göre kitap arama \n5- ıd ile kitap arama");
        byte secenek = scan.nextByte();
        switch (secenek) {
            case 1:
                ekle();
                break;
            case 2:
                Lİstele();
                break;
            case 5:
                bulBy_Id();
                break;
        }
    }

    public static void bulBy_Id() {
        int istenenId = 0;
        String bulunanKİtap = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("bukunmasını istediğin ıd gir: ");
        istenenId = scan.nextInt();

        if (kitaplar.isEmpty()) {
            System.out.println("hiç kitap yok");
        } else if (kitaplar.containsKey(istenenId)) {
            bulunanKİtap = kitaplar.get(istenenId);
            System.out.println("aradığınız kitap : " + bulunanKİtap);
        } else {
            System.out.println("bu id bilgisine sahip kitap bulunmamaktadır");
        }
        menu();
    }

    // ekleme fonksiyonu yapıyor String değerler alacağız ve hashmap e ekleyeceğiz
    public static void ekle() {    // metod tanımadık
        Scanner scan = new Scanner(System.in);
        System.out.print("kitabın ismi: ");
        ad = scan.nextLine();
        System.out.println("kitabın yazarı: ");
        yazar = scan.nextLine();
        System.out.println("kitabın yayınlanma tarihi: ");
        yayinTarihi = scan.next();
        String kitapInfo = ad + " - " + yazar + " - " + yayinTarihi;
        kitaplar.put(id++, kitapInfo);

    }

    // var olan kitaplar hash map ne varsa yazdıralım  listelemeişini for each ile yapılabilir
    public static void Lİstele() {
        for (Integer key : kitaplar.keySet()) {
            System.out.println(key + ": " + kitaplar.get(key));
        }
    }
}