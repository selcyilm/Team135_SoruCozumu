package esra;

public class KitapRunner {
    /*

    1. Kullanicinin kitap ekleme, silme ve listeleme gibi
       islemleri yapmasina imkan taniyan bir uygulama yaziniz.

    2. Program kitaplara 1001 den baslayarak sirali ve otomatik
       numara vermelidir.

       Bunun yaninda her bir kitap icin Kitap Adi, Yazar Adi,
       Yayin Yili ve Fiyat gibi bilgiler girilebilmelidir.

    3. Programin baslangicinda kullaniciya asagidaki gibi bir menu
       sunulmalidir.

       Kullanici programi bitirene kadar islemlere devam edebilmelidir.


       ====================KITAP PROGRAMI==========================

       1: Kitap ekle
       2: Numara ile kitap sil
       3: Tum kitaplari listele
       4: Bitir

    */


    //static List<KitapFields> kitapListesi = new ArrayList<>(); // Bos Bir liste


    public static void main(String[] args) {

        KitapMethods.kitaplarListesi();
        KitapMethods.menu();

    }
}