package esra;

public class KitapFields {

    private int kitapNo;
    private String kitapAdi;
    private String yazarAdi;
    private int yayinyili;
    private double fiyat;

    public int getKitapNo() {
        return kitapNo;
    }

    public void setKitapNo(int kitapNo) {
        this.kitapNo = kitapNo;
    }

    public String getKitapAdi() {
        return kitapAdi;
    }

    public void setKitapAdi(String kitapAdi) {
        this.kitapAdi = kitapAdi;
    }

    public String getYazarAdi() {
        return yazarAdi;
    }

    public void setYazarAdi(String yazarAdi) {
        this.yazarAdi = yazarAdi;
    }

    public int getYayinyili() {
        return yayinyili;
    }

    public void setYayinyili(int yayinyili) {
        this.yayinyili = yayinyili;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public KitapFields() {

    }

    public KitapFields(int kitapNo, String kitapAdi, String yazarAdi, int yayinyili, double fiyat) {
        this.kitapNo = kitapNo;
        this.kitapAdi = kitapAdi;
        this.yazarAdi = yazarAdi;
        this.yayinyili = yayinyili;
        this.fiyat = fiyat;
    }

    @Override
    public String toString() {
        return "KitapFields{" +
                "kitapNo=" + kitapNo +
                ", kitapAdi='" + kitapAdi + '\'' +
                ", yazarAdi='" + yazarAdi + '\'' +
                ", yayinyili=" + yayinyili +
                ", fiyat=" + fiyat +
                '}';
    }
}
