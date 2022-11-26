package learn;

import java.util.ArrayList;

import java.util.List;
import java.util.Map;

import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		List<Ogrenci> ogrenciler = new ArrayList<Ogrenci>();

		ogrenciler.add(new Ogrenci("Ali", 100));
		ogrenciler.add(new Ogrenci("Melihcan", 101));
		ogrenciler.add(new Ogrenci("Buse", 102));
		ogrenciler.add(new Ogrenci("Mert", 103));
		ogrenciler.add(new Ogrenci("Fatih", 104));

		// Stream : Akış

		// Öğrenciler listesinin üzerinden gidip işlemler yapmamızı sağlar.
		// bir nevi akış oluşturur.

		// ogrenciler.stream yazdığımız yazan kaynağı ogrenciler arraylist olan bir akış
		// oluşturur.

		// Lambda functions: ok -> 'un solundaki ogrenci parametredir.
		// sağındaki ise çalışacağı parametredir.

		// .foreach() kullandığımız zaman bütün listedeki elemanlar için döner.

		ogrenciler.stream().forEach(ogrenci -> System.out.println(ogrenci));
		System.out.println();
		// örnek2

		ogrenciler.stream().forEach(ogrenci -> {
			System.out.println("Öğrenci Bilgisi: ");
			System.out.println(ogrenci);
			System.out.println("------");
		});

		// Sınav notları print etme

		ogrenciler.stream().forEach(ogr -> ogr.sinavNotu());

		System.out.println("\n---------------------\n");

		// 44.satırın çok daha kısa yazılacak hali aşağıdaki gibi
		// :: kullanmak bunun adına method ref. denir.
		// SınıfAdı :: MethodAdı
		ogrenciler.stream().forEach(Ogrenci::sinavNotu);
		// :: => öğrenci sınıfı içindeki sinavNotu methodunu çağır demek.

		// En sık kullanılanlar
		//
		// filter methodur.

		long id102denBuyukCount = ogrenciler.stream().filter(ogrenci -> ogrenci.getId() > 102).count();
		System.out.println(id102denBuyukCount);

		// collect methodu ile filtre sonuclarını liste haline çevirme

		List<Ogrenci> filtrelenmisListe = ogrenciler.stream().filter(ogr -> ogr.getId() > 102)
				.collect(Collectors.toList());
		System.out.println(filtrelenmisListe);

		// map 'leme işlemi
		//

		List<Ogrenci> mappedList = ogrenciler.stream().map(ogr -> new Ogrenci(ogr.getAdi(), ogr.getId() * 100))
				.collect(Collectors.toList());
		System.out.println(mappedList);

		// Map sınıfından oluşturalım

		Map<Integer, String> ogrenciMap = ogrenciler.stream()
				.collect(Collectors.toMap(ogr -> ogr.getId(), ogr -> ogr.getAdi()));
		ogrenciMap.forEach((key, value) -> System.out.println(key + "  " + value));

	}

}
