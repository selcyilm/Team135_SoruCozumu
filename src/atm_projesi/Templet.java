package atm_projesi;

public interface Templet {
	// Bakiye sorgula, para yatirma, para çekme, para gönderme, sifre değiştirme ve cikis.
	void getBalance();
	void withdrawMoney();

	void depositMoney();

	void transferMoney();

	void changePassword();

	void exitProgram();

}
