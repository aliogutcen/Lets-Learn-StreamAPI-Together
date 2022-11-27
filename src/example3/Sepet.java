package example3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Sepet {

	EUrun product[] = EUrun.values(); // enumları arrayin içine attik
	List<Urun> urunler = new ArrayList<>();
	Map<String, Integer> sepetMap = new HashMap<>();
	Map<String, Double> urunMap = new HashMap<>();

	public void urunOlustur() {

		urunler = Arrays.asList(product).stream().map(urun -> new Urun(urun.name(), urun.fiyat))
				.collect(Collectors.toList());

	}

	public void urunleriListele() {
		urunler.forEach(s -> System.out.println(s.getName()));
	}

	public void urunFiyatMapOlustur() {

		urunMap = urunler.stream().collect(Collectors.toMap(u -> u.getName(), fiyat -> fiyat.getFiyat()));

	}

	public void fiyatListesi() {
		urunMap.entrySet().forEach(System.out::println);
	}

	public void sepetAdedi() {

		int count = 0;
		for (int i = 0; i < sepetMap.size(); i++) {
			// entrySet yazdıgımız zaman stream'e cevirebiliyoruz
			long y = sepetMap.entrySet().stream().filter(x -> x.getValue() > 0).count();
			System.out.println(y);

		}

	}

	public void sepeteUrunEkle() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Eklemek istediğiniz ürünü giriniz");
		String s = sc.nextLine();

		if (urunMap.containsKey(s)) {

			if (sepetMap.containsKey(s)) {
				sepetMap.replace(s, sepetMap.get(s) + 1);
				System.out.println("Sepetinizde " + s + " ürününden " + sepetMap.get(s) + " tane vardır.");

			} else
				sepetMap.put(s, 1);
			System.out.println("Sepetinize 1 adet " + s + " eklendi.");

		} else {
			System.out.println("Ürün listede olmadığı için eklenemedi");

		}

	}

	public void sepetiGoster() {
		for (Map.Entry<String, Integer> entry : sepetMap.entrySet()) {
			String key = entry.getKey();
			Integer val = entry.getValue();
			System.out.println("Sepetinizde\n Ürün Adı:" + key + "\n Kaç adet var=" + val);

		}
	}
	
	
	
	public void fiyati50denBuyukOlanListele() {
		Map<String, Double> ellidenBuyuk = urunMap.entrySet().stream().filter(x-> x.getValue()>50).collect(Collectors.toMap(x->x.getKey(), y->y.getValue()));
		ellidenBuyuk.forEach((key,value)->System.out.println(key+" "+value));
		
	}

}
