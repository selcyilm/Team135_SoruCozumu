package Hacer;

import java.util.Scanner;

public class UglyNumber {
    // Ugly Number:

    //Girilen bir sayının  ugly number olup olmadığını kontrol etmek için bir Java programı yazın.
    // Sayı sisteminde,  ugly number  sadece asal faktörleri carpanlari 2, 3 veya 5 olan pozitif sayılardan olusur...
    //İlk 10  ugly number 1, 2, 3, 4, 5, 6, 8, 9, 10, 12'dir. Kural olarak, 1 dahil.

    public static boolean isUgly(int num) {

        if (num <= 0) {
            return false;
        }

        while (num % 2 == 0) {

            num /= 2;
        }

        while (num % 3 == 0) {

            num /= 3;
        }

        while (num % 5 == 0) {

            num /= 5;
        }

        return num == 1;


    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayi giriniz");

        int userInput = scanner.nextInt();

        if (isUgly(userInput)) {

            System.out.println(userInput + " Girilen sayi ugly nummber'dir");
        } else {

            System.out.println(userInput + " Girilen sayi ugly number degildir");
        }

        scanner.close();
    }
}

// git config --global user.email "hacer.coskun@web.de"

// git config --global user.name "Hacer"