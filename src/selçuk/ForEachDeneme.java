package selçuk;

import java.util.ArrayList;
import java.util.Arrays;

public class ForEachDeneme {
	public static void main(String[] args) {
		ArrayList<Integer> sayılar = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));

		for (int i = 0; i < sayılar.size(); i++) {
			System.out.println(sayılar.get(i));
			sayılar.remove(i); // 1 removed [2, 3, 4, 5, 6]
			//System.out.printf("%d başarıyla silindi\n", sayılar.get(i));
			i--;
		}
		System.out.println("Loopun sonu");
	}
}
