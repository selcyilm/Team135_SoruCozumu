package atm_projesi;

import java.util.List;

public class Runner {
	/*
		Classlar:

		Runner (Programı çalıştırsın)
		Menü (ANA MENÜ ==>> ADMİN MENU || USER MENÜ)
		İşlemler (Şablon interface’indeki tüm methodlar oluşturulsun)
		Kullanıcı (adı(string), kart numarası(string), şifre(string),
		bakiye(int), iban(TR\ __ \ __ 4 HANELİ)(string)) (MÜŞTERİ NO == unique olucak 1000’den başlayacak)
		Admin (Admine ait özel işlemler== Kullanıcı ekle- Kullanıcı sil- Kullanıcı ara-
		Kullanıcı bakiye değiştir- Logine geri dön) Admin classı İşlemler classının childi olacaktır.
		İşlemlerdeki tüm methodları uygulayabilecek ve kendine özel methodları olucaktır.

		Interface:

		işlemler için interface (Şablon)
		Bakiye sorgula, para yatirma, para çekme, para gönderme,
		sifre değiştirme ve cikis methodları yazılacak.
	 */
	public static void main(String[] args) {
		List<User> deneme = UserRepo.createUserRepo();
		for (int i = 0; i < deneme.size(); i++) {
			System.out.println(deneme.get(i));
		}
	}
}
