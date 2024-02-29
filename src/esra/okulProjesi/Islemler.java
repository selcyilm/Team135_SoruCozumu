package esra.okulProjesi;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler {

    /*
    2- Program basladiginda kullaniciya ogretmen ve ogrenci islemlerini secebilmesi icin
       asagidaki gibi bir menu gosterilsin.

              ==================================
              OGRENCI VE OGRETMEN YONETIM PANELI
              ==================================

              1-OGRENCI ISLEMLERI
              2-OGRETMEN ISLEMLERI
              Q-CIKIS

     */

    static Scanner scanner = new Scanner(System.in);
    // Ogrenci ya da ogretmen icin ekleme, silme, listeleme islemlerini
    // yapabilmek icin birer ogrenci ve ogretmen listesine ihtiyacim var.

    static List<Kisi> ogrenciListesi = new ArrayList<>(); // Bos liste
    static List<Kisi> ogretmenListesi = new ArrayList<>(); // Bos liste
    static String kisiTuru;

    public static void anaMenu() {

        System.out.println("==================================\n" +
                "OGRENCI VE OGRETMEN YONETIM PANELI\n" +
                "==================================");
        System.out.println("1-OGRENCI ISLEMLERI\n" +
                "2-OGRETMEN ISLEMLERI\n" +
                "Q-CIKIS");

        // Kullanicidan bir secim yapmasini istemem gerekiyor.

        System.out.print("Tercihinizi giriniz : ");
        String tercih = scanner.next().toUpperCase();

        // Kullaniciyi yapmak isteyecegi islemlere yonlendirmem gerekiyor.
        // Bunun icin de switch kullanabiliriz.

        switch (tercih) {

            case "1":
                kisiTuru = "OGRENCI";
                islemler();
                break;
            case "2":
                kisiTuru = "OGRETMEN";
                islemler();
                break;
            case "Q":
                cikis();
                break;
            default:
                System.out.println("Hatali giris yaptiniz!");
                anaMenu();
                break;


        }


    }

    private static void cikis() {
        System.out.println("Yine bekleriz:)");
        scanner.close();
    }

    private static void islemler() {

        /*

        3- Secilen kisi turune gore asagidaki islemleri gosteren bir alt menu gosterilsin

              ============ISLEMLER=============

              1-EKLEME
              2-ARAMA
              3-LISTELEME
              4-SILME
              Q-ANA MENU
         */

        System.out.println("============ISLEMLER=============");
        System.out.println("1-EKLEME\n2-ARAMA\n3-LISTELEME\n4-SILME\nQ-ANA MENU");

        System.out.print("Islem tercihinizi giriniz : ");
        String islemTercihi = scanner.next().toUpperCase();

        switch (islemTercihi) {

            case "1":
                ekleme();
                islemler();
                break;
            case "2":
                arama();
                islemler();
                break;
            case "3":
                listeleme();
                islemler();
                break;
            case "4": silme();
                islemler();
                break;
            case "Q":
                anaMenu();


        }


    }

    private static void silme() {

         /*
         4- Islemler menusunde secilen isleme gore bir onceki menude secilen kisi turu ile ilgili
       ekleme, kimlik no ile silme ve arama, var olan tum kisileri listeleme gibi islemler
       yapilabilmelidir. Bunun yaninda bir ust menuye donme veya cikis islemleri de yapilabilmelidir.

         */
        boolean kontrol = true;
        if (kisiTuru.equalsIgnoreCase("OGRENCI")) {

            // ogrenci oldugu icin ogrenci listesinde bir silme
            // yapmam gerekiyor.

            System.out.print("Silmek istediginiz ogrencinin kimlik nosunu giriniz : ");
            String silKimlikNo = scanner.next();

            for (Kisi ogrenci : ogrenciListesi
            ) {

                if (ogrenci.getKimlikNo().equals(silKimlikNo)) {
                    System.out.println("Silinen ogrenci : " + ogrenci.getAdSoyad());
                    ogrenciListesi.remove(ogrenci);
                    kontrol = false;
                    break;
                }

                if (kontrol) {
                    System.out.println("Silmek istediginiz kimlik nosu ile eslesen ogrenci bulunmamaktadir.");

                }

            }


        } else {

            // ogretmen oldugu icin ogretmen listesinde bir silme
            // yapmam gerekiyor.

            System.out.print("Silmek istediginiz ogretmenin kimlik nosunu giriniz : ");
            String araKimlikNo = scanner.next();

            for (Kisi ogretmen : ogretmenListesi
            ) {

                if (ogretmen.getKimlikNo().equals(araKimlikNo)) {
                    ogretmenListesi.remove(ogretmen);
                    kontrol = false;
                    break;
                }

                if (kontrol) {
                    System.out.println("Silmek istediginiz kimlik nosu ile eslesen ogretmen bulunmamaktadir.");

                }


            }


        }


    }


    private static void listeleme() {

        if (kisiTuru.equalsIgnoreCase("OGRENCI")) {

            for (Kisi ogrenci : ogrenciListesi
            ) {

                System.out.println(ogrenci.toString());

            }

        } else {

            for (Kisi ogretmen : ogretmenListesi
            ) {

                System.out.println(ogretmen.toString());
            }

        }


    }

    private static void arama() {
        /*
         4- Islemler menusunde secilen isleme gore bir onceki menude secilen kisi turu ile ilgili
       ekleme, kimlik no ile silme ve arama, var olan tum kisileri listeleme gibi islemler
       yapilabilmelidir. Bunun yaninda bir ust menuye donme veya cikis islemleri de yapilabilmelidir.

         */

        boolean kontrol = true;
        if (kisiTuru.equalsIgnoreCase("OGRENCI")) {

            // ogrenci oldugu icin ogrenci listesinde bir arama
            // yapmam gerekiyor.

            System.out.print("Arama yapmak istediginiz ogrencinin kimlik nosunu giriniz : ");
            String araKimlikNo = scanner.next();

            for (Kisi ogrenci : ogrenciListesi
            ) {

                if (ogrenci.getKimlikNo().equals(araKimlikNo)) {
                    System.out.println("Aranan ogrenci : " + ogrenci.getAdSoyad());
                    kontrol = false;
                }

                if (kontrol) {
                    System.out.println("Aradiginiz kimlik nosu ile eslesen ogrenci bulunmamaktadir.");

                }


            }


        } else {

            // ogretmen oldugu icin ogretmen listesinde bir arama
            // yapmam gerekiyor.

            System.out.print("Arama yapmak istediginiz ogretmenin kimlik nosunu giriniz : ");
            String araKimlikNo = scanner.next();

            for (Kisi ogretmen : ogretmenListesi
            ) {

                if (ogretmen.getKimlikNo().equals(araKimlikNo)) {
                    System.out.println("Aranan ogretmen : " + ogretmen.getAdSoyad());
                    kontrol = false;
                }

                if (kontrol) {
                    System.out.println("Aradiginiz kimlik nosu ile eslesen ogretmen bulunmamaktadir.");

                }


            }


        }


    }

    private static void ekleme() {

        // Kullanicidan ogrenci ve ogretmen icin bilgileri alacagim.
        // Bu bilgileri alip eger ogrenci ise ogrenci classindan
        // Ogretmense de ogretmen classindan obje olusturacagim.

        System.out.print("Ad soyad giriniz : ");
        scanner.nextLine();
        String adSoyad = scanner.nextLine();
        System.out.print("Kimlik no giriniz : ");
        String kimlikNo = scanner.next();
        System.out.print("Yas giriniz : ");
        int yas = scanner.nextInt();

        if (kisiTuru.equalsIgnoreCase("OGRENCI")) {
            System.out.print("Ogrenci no giriniz : ");
            String ogrenciNo = scanner.next();
            System.out.print("Ogrenci sinifi giriniz : ");
            String ogrenciSinif = scanner.next();
            Ogrenci ogrenci = new Ogrenci(adSoyad, kimlikNo, yas, ogrenciNo, ogrenciSinif);
            // Bu noktada sadece Ogrenci classindan ogrenci objemi olusturmus oldum
            // Bos olan ogrenci listemize ekleyelim.
            ogrenciListesi.add(ogrenci);
            System.out.println(ogrenci.toString() + " eklendi.");

        } else if (kisiTuru.equalsIgnoreCase("OGRETMEN")) {
            System.out.print("Ogretmen bolum giriniz : ");
            String bolum = scanner.next();
            System.out.print("Ogretmen sicil no giriniz : ");
            String sicilNo = scanner.next();
            Ogretmen ogretmen = new Ogretmen(adSoyad, kimlikNo, yas, bolum, sicilNo);
            ogretmenListesi.add(ogretmen);
            System.out.println(ogretmen.toString() + " eklendi.");

        } else System.out.println("Hatali giris yaptiniz !");

    }
}
