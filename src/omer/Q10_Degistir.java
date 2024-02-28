package omer;

import java.util.Scanner;

public class Q10_Degistir {
    public static String degistir(String kelime) {
        String ters = "";
        for (int i = kelime.length() - 1; i >= 0; i--) {
            ters += kelime.charAt(i);
        }
        return ters;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir kelime yaziniz : ");
        String kelime = scanner.nextLine();

        System.out.println(degistir(kelime));
    }
}
