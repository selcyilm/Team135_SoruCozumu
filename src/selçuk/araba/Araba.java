package selçuk.araba;

public class Araba {
	/*
		//1- fieldları(encapsulated) model(String), renk(String), motor(int), yil (int)
		// olan Araba isimli bir class cretae ediniz.
		// 2- bütün fieldları parametre alan bir constructor tanımlayınız.
		// 3- ArabaMain isminde main için bir class oluşturunuz.
		// 4- İki adet parametreli const 1 adet parametresiz cons ile 3 adet araba creat ediniz
		// 5- aracların motor hacmi 1000 cc ve üstü olması ve yılını hatalı veri girisine karsi kontrol ediniz.
	 */
	private String	model = "Model girilmedi";
	private String	renk = "Renk tanımlanmadı";
	private int		motor = 0;
	private int		yıl = 0;

	public Araba(String model, String renk, int motor, int yıl) {
		this.model = model;
		this.renk = renk;
		if (motor > 1000 || motor < 0) {
			System.out.println("Model: " + this.model);
			System.out.println("Hatalı motor girişi, motor 0 cc olarak tanımlandı!");
		}
		else
			this.motor = motor;
		if (yıl < 1900 || yıl > 2024) {
			System.out.println("Model: " + this.model);
			System.out.println("Hatalı yıl girdiniz, yıl otomatik olarak 0 tanımlandı!");
		}
		else
			this.yıl = yıl;
	}

	public Araba() {

	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public int getMotor() {
		return motor;
	}

	public void setMotor(int motor) {
		if (motor > 1000 || motor < 0) {
			System.out.println("Model: " + this.model);
			System.out.println("Hatalı motor cc girişi!");
		}
		else
			this.motor = motor;
	}

	public int getYıl() {
		return yıl;
	}

	public void setYıl(int yıl) {
		if (yıl < 1900 || yıl > 2024)
			System.out.println("Model: " + this.model + "\nHatalı yıl girişi yapılmıştır!");
		else
			this.yıl = yıl;
	}

	@Override
	public String toString() {
		return "Araba{" +
				"model='" + model + '\'' +
				", renk='" + renk + '\'' +
				", motor=" + motor +
				", yıl=" + yıl +
				'}';
	}
}
