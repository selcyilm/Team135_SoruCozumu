package selçuk.araba;

public class ArabaMain {
	public static void main(String[] args) {
		Araba araba1 = new Araba();
		araba1.setModel("Mercedes");
		araba1.setRenk("Beyaz");
		araba1.setYıl(1800);
		araba1.setMotor(800);
		System.out.println(araba1);

		Araba araba2 = new Araba("Nissan", "Kırmızı", 800, 2012);

		System.out.println(araba2);

		Araba araba3 = new Araba("Lancia", "Siyah", 1200, -1);

		System.out.println(araba3);


	}
}
