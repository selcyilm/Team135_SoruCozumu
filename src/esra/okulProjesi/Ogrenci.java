package esra.okulProjesi;

public class Ogrenci extends Kisi {

    //  - Ogrenci  : numara, sinif gibi bilgileri icermelidir.

    private String ogrenciNo;
    private String sinif;

    public Ogrenci() {

    }

    public Ogrenci(String adSoyad, String kimlikNo, int yas, String ogrenciNo, String sinif) {
        super(adSoyad, kimlikNo, yas); // parent classtan aliyor
        this.ogrenciNo = ogrenciNo;
        this.sinif = sinif;
    }

    public String getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(String ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }

    @Override
    public String toString() {
        return "Ogrenci{" + super.toString() +
                "ogrenciNo='" + ogrenciNo + '\'' +
                ", sinif='" + sinif + '\'' +
                '}';
    }
}
