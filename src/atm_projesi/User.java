package atm_projesi;

public class User {
	private String name;
	private String surname;
	private String cardNumber;
	private String password;
	private int balance;

	private String iban;

	private int userNo;

	public User(String name, String surname, String cardNumber, String password, int balance, String iban, int userNo) {
		this.name = name;
		this.surname = surname;
		this.cardNumber = cardNumber;
		this.password = password;
		this.balance = balance;
		this.iban = iban;
		this.userNo = userNo;
	}

	public User() {

	}

	public String getCardNumber() {
		return cardNumber;
	}

	public String getIban() {
		return iban;
	}

	public int getUserNo() {
		return userNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "User{" +
				"name='" + name + '\'' +
				", surname='" + surname + '\'' +
				", cardNumber='" + cardNumber + '\'' +
				", password='" + password + '\'' +
				", balance=" + balance +
				", iban='" + iban + '\'' +
				", userNo=" + userNo +
				'}';
	}
}
