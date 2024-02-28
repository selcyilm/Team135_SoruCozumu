package selçuk;

import java.util.Arrays;
import java.util.Scanner;

public class ArmstrongNumberFinder {
	/*
		Java ile girilen N sayısının bir Armstrong sayısı olup olmadığını bulan programı yazın.
		Armstrong Sayısı N haneli bir sayının basamaklarının n’inci üstlerinin toplamı,
		sayının kendisine eşitse, böyle sayılara Armstrong sayı denir.

		Örneğin 407 sayısını ele alalım. (4^3)+ (0^3)+(7^3) = 64+0+343 = 407 sonucunu verir.
		Bu da 407 sayısının armstrong bir sayı olduğunu gösterir. 1342 sayısına da bakalım.
		(1^4)+(3^4)+(4^4)+(2^4) =1+81+256+16=354 sayısı 1342’ye eşit olmadığı için armstrong
		sayı olmaz.
		1634=1^4+6^4+3^4+4^4=1+1296+81+256=1634
		54748=5^5+4^5+7^5+4^5+8^5=3125+1024+16807+1024+32768=54748
		Örnek Çıktı Sayı Giriniz : 407 407 bir Armstrong Sayıdır.
		Sayı Giriniz : 303 303 bir Armstrong Sayı Değildir.
	 */
	/*
		1- Kullanıcıdan sayı alıcam
			-sayı negatifse
			-bir kere daha isteyebilirim
			-veya direkt programdan çıkabilim.

			neye ihtiyacım var:
			- sayının uzunluğu
			- sayının her bir digitinin uzunluğunun power olarak alınıp toplanması
			- toplam sonucun asıl sayıyla karşılaştırılması
			- eğer topam == asıl sayı ===>>> armstrong sayı
			- eğer toplam != asıl sayı ===>>> armstrong sayı değil

		2- bir method oluşturup girilen numaranın uzunluğunu bana 407
			döndüren bir method oluştur =====> 3
		3- bir method oluşturup girilen sayının tüm digitlerini 407
			bir array içerisine kaydeden method oluşturabilirim [4, 0, 7]
		4- bir method oluşturup arrayi parametre olarak alan [4, 0, 7], uzunluk = 3
			ve arrayin her değerini uzunluğuyla powerını alan
			ve sonuçları bana toplayıp döndüren bir method oluşturalım
			int toplam = 4^3 + 0^3 + 7^3
			return (toplam);
		5- main methodda kullanıcının girdiği sayıyla toplamı karşılaştırırım
			eğer toplam == sayı => armstrong
			değilse			==> armstrong değil
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a positive int: ");
		int	sayi = scanner.nextInt();
		if (sayi < 0) {
			System.err.println("Sayı negatif olamaz!");
			System.exit(1);
		}
		int	length = sayıUzunluk(sayi);
		System.out.println(length);
		int arr[] = getDigits(sayi, length);
		System.out.println(Arrays.toString(arr));
		int toplam = sumOfDigits(arr, length);
		System.out.println(toplam);
		isArmstrong(sayi, toplam);

	}
	public static int	sayıUzunluk(int sayi) {
		// 407
		// loop sayi != 0 sayı /= 10; 407
		// 40 1
		// 4 2
		// 0 3
		int	i = 0;

		while (sayi != 0) {
			sayi /= 10;
			i++;
		}
		return (i);
	}

	public static int[] getDigits(int num, int length) {
		// arr oluştur
		// arr her bir elemanına
		// num % 10 407 ====> 7 arr[0]
		// num /= 10 40 0 arr[1] ==>>> 4 arr[2] ===> 4
		// [7, 0, 4]
		int arr[] = new int[length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = num % 10;
			num /= 10;
		}
		return (arr);
	}

	public static int	sumOfDigits(int arr[], int lenght) {
		// arrayin her bir elemanına ulaşıcam
		// int toplam = 0;
		// toplam += arr[i] ^ uzunluk;
		// [7, 0, 4]  7 ^ 3
		int	toplam = 0;
		for (int i = 0; i < arr.length; i++) {
			toplam += (int) Math.pow(arr[i], lenght);
		}
		return (toplam);
	}

	public static boolean isArmstrong(int sayi, int toplam) {
		if (sayi == toplam) {
			System.out.println(sayi + " bir Armstrong sayıdır.");
			return (true);
		}
		else {
			System.out.println(sayi + " bir Armstrong sayı değildir.");
			return (false);
		}
	}
}
