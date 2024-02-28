package esra;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KitapMethods {

    static Scanner scanner = new Scanner(System.in);

    static int kitapNo = 1000;

    static List<KitapFields> kitapListesi = new ArrayList<>(); // Bos Bir liste

    public static void menu() {

        System.out.println("====================KITAP PROGRAMI==========================");
        System.out.println("1: Kitap ekle\n" +
                "2: Numara ile kitap sil\n" +
                "3: Tum kitaplari listele\n" +
                "4: Bitir");
        System.out.print("Tercihinizi giriniz: ");
        //System.out.println(kitapListesi.toString());
        int tercih = scanner.nextInt();

        switch (tercih) {

            case 1:
                kitapEkle(kitapListesi);
                break;
            case 2:
                kitapSil(kitapListesi);
                break;
            case 3:
                kitapListele(kitapListesi);
                break;
            case 4:
                bitir();
                break;
            default:
                System.out.println("Hatali giris yaptiniz. Tekrar deneyiniz.");
                menu();

        }


    }

    private static void kitapListele(List<KitapFields> kitapListesi) {


        for (KitapFields k : kitapListesi
        ) {
            System.out.println(k.toString());
        }

        menu();

    }

    private static void kitapSil(List<KitapFields> kitapListesi) {

        System.out.print("Silmek istediginiz kitap nosunu giriniz : ");
        int silinecekKitapNo = scanner.nextInt();

        for (KitapFields k : kitapListesi
        ) {
            if (k.getKitapNo() == silinecekKitapNo) {
                kitapListesi.remove(k);
                System.out.println(k.getKitapAdi() + " isimli kitap silinmistir.");
                kitapListele(kitapListesi);
                menu();
            }

        }
        System.out.println("Girmis oldugunuz numarayla eslesen bir kitap bulunmamaktadir.");
        menu();

    }

    private static void kitapEkle(List<KitapFields> kitapListesi) {

        System.out.print("Kitap ismi giriniz :");
        scanner.nextLine(); // Bos bir scanner objesi olusturduk => dummy
        String kitapAdi = scanner.nextLine();
        System.out.print("Yazar ismi giriniz : ");
        String yazarAdi = scanner.nextLine();
        System.out.print("Yayin yili giriniz : ");
        int yayinYili = scanner.nextInt();
        System.out.print("Fiyat giriniz : ");
        double fiyat = scanner.nextDouble();

        KitapFields kitap = new KitapFields(++kitapNo, kitapAdi, yazarAdi, yayinYili, fiyat);
        kitapListesi.add(kitap);
        //System.out.println(kitap.toString());
        menu();
    }

    private static void bitir() {
        System.out.println("Yine bekleriz");
        scanner.close();
    }

    public static void kitaplarListesi() {

        KitapFields kitap1 = new KitapFields(++kitapNo, "Huzur", "Ahmet Hamdi Tanpinar", 1900, 10);
        KitapFields kitap2 = new KitapFields(++kitapNo, "Sefiller", "Victor Hugo", 1910, 20);
        KitapFields kitap3 = new KitapFields(++kitapNo, "Ince Memed", "Yasar Kemal", 1920, 30);
        KitapFields kitap4 = new KitapFields(++kitapNo, "1984", "George Orwell", 1930, 40);
        KitapFields kitap5 = new KitapFields(++kitapNo, "Aclik", "Knut Hamsun", 1940, 50);

        kitapListesi.add(kitap1);
        kitapListesi.add(kitap2);
        kitapListesi.add(kitap3);
        kitapListesi.add(kitap4);
        kitapListesi.add(kitap5);

        System.out.println(kitapListesi.toString()); }

}


