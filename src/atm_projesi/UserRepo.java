package atm_projesi;

import java.util.ArrayList;
import java.util.List;

public class UserRepo {
	private static int num = 100;
	public static List<User> createUserRepo() {
		List<User> users = new ArrayList<>();
		users.add(new User("Selçuk", "Yilmaz", "1234", "qwerty", 100, "TR1234", ++num));
		users.add(new User("Bekir", "Sarikaya", "2345", "qwerty", 100, "TR2345", ++num));
		users.add(new User("Esra", "Celik", "3456", "qwerty", 100, "TR3456", ++num));
		users.add(new User("Omer", "Gursel", "4567", "qwerty", 100, "TR4567", ++num));
		return (users);
	}
}
