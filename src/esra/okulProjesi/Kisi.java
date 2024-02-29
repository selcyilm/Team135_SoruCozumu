package esra.okulProjesi;

public class Kisi {

    //- Ogretmen : Ad-Soyad, kimlik no, yas
    //- Ogrenci  : Ad-Soyad, kimlik no, yas

    // Kisi classini Parent class olarak belirledim.
    // Hem ogretmen hem de ogrenci icin ortak olan variable lari
    // bu classta belirleyecegim.
    // Bu classtan obje olusturacagim.
    // Obje olusturmak icin constructor a ihtiyacim var.
    // default const. zaten mevcut
    // Parametreli const olusturacagim.
    // Javanin default const. yok oluyordu.
    // Manuel bir parametresiz const.olusturacagim.

    private String adSoyad;
    private String kimlikNo;
    private int yas;

    // Class levelda olduklari icin deger atamak zorunda degilim.
    // Class levelda olusturulan variable lara Java otomatik olarak
    // default degerler atiyordu.

    // encapsulation icin 2 adima dikkat etmemiz gerekiyordu.
    // 1-Private yapmak
    // 2-Public olan getter ve setter methodlari olusturmak.

    // Objeyi yazdirirken referans numaralarini gormek istemedigim icin
    // toString() methodu olusturacagim.

    public Kisi() {

    }

    public Kisi(String adSoyad, String kimlikNo, int yas) {
        this.adSoyad = adSoyad;
        this.kimlikNo = kimlikNo;
        this.yas = yas;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(String kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "adSoyad='" + adSoyad + '\'' +
                ", kimlikNo='" + kimlikNo + '\'' +
                ", yas=" + yas +
                '}';
    }
}
