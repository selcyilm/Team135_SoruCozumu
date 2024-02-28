package omer;

import java.util.Scanner;

public class Q14_HackerDili {
     /*
    Kullanıcının yazdığı metni, 'hacker'ların konuşma
     diline çevirip return eden bir method(method ismi
     hackerDili) yazınız.

     Hackerlar bazı harfleri sayılara çevirerek
     yazışabiliyorlar. Genellikle çevirdikleri
     harfler şu şekilde:
     s -> 5
     a -> 4
     e -> 3
     i -> 1
     o -> 0

     Test data
     hackerDili("javayı severim")
     j4v4yı 53v3r1m

     İpucu harfleri değiştirin ve ekrana yazdırın.
     */

    /*
    public static void hackerDili(String metin) {
        char[] harfler = {'s', 'a', 'e', 'i', 'o'};
        char[] sayilar = {'5', '4', '3', '1', '0'};

        for (int i = 0 ; i < 5 ; i++) {
            metin = metin.replace(harfler[i], sayilar[i]);
        }

        System.out.println(metin);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir metin giriniz : ");

        String giris = scanner.nextLine();

        hackerDili(giris);

    }
    */


    public static String hackerDili(String metin) {
        metin = metin.replace("s", "5");
        metin = metin.replace("a", "4");
        metin = metin.replace("e", "3");
        metin = metin.replace("i", "1");
        metin = metin.replace("o", "0");

        return metin;
    }

    public static String numaraYildiz(String metin) {
        metin = metin.replaceAll("\\d", "*");
        return metin;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir metin giriniz : ");

        String metin = scanner.nextLine();

        metin = hackerDili(metin);

        System.out.println(numaraYildiz(metin));
    }
}
