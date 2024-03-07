package betul;

public class KayipHarfler {
    public static String kayipHarfler(String kelime) {

        String alfabe = "abcdefghijklmnopqrstuvwyz"; //kayipHarfler metodunun içinde İngilizce alfabesini
        // temsil eden bir String olan alfabe tanımliyoruz.


        for (int i = 0; i < kelime.length()-1; i++){  //Kelimenin uzunluğu kadar bir döngü  oluşturuluyoruz.

            char mevcutHarf = kelime.charAt(i);//Her iterasyonda, mevcut harf (mevcutHarf) ve sonraki harf (sonrakiHarf) aliyoruz.
            char sonrakiHarf = kelime.charAt (i+1);

            if (sonrakiHarf - mevcutHarf > 1){ //if koşulu ile mevcut harf ile sonraki harf arasında atlanmış harfler var mı kontrol ediyoruz

                return String.valueOf((char)(mevcutHarf +1));//Eğer atlanmış harfler varsa, atlanan harfi bulup String olarak döndürüyoruz.
                //return "" + (char) (mevcutHarf + 1);

            }
        }
        return"Sirali Harfler";//Döngü bittikten sonra atlanmış harf bulunmamışsa, "Sıralı Harfler" String'ini döndürüyoruz.

    }

    public static void main(String[] args) { // main metodunda, kayipHarfler metodunu test ediyoruz.

        System.out.println(kayipHarfler("abdefg"));//c
        System.out.println(kayipHarfler("pqrstu"));// Sirali Harfler
    }
}
