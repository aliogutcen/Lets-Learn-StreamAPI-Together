package example.ornek3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamApiOrnek3 {

	public static void main(String[] args) {
		Kisi kisi1= new Kisi("Ali",30,ECinsiyet.ERKEK);
		Kisi kisi2= new Kisi("Melih",55,ECinsiyet.ERKEK);
		Kisi kisi3= new Kisi("Mert",25,ECinsiyet.ERKEK);
		Kisi kisi4= new Kisi("Furkan",75,ECinsiyet.ERKEK);
		Kisi kisi5= new Kisi("Buse",85,ECinsiyet.KADIN);
		Kisi kisi6= new Kisi("Merve",30,ECinsiyet.KADIN);

		
		List<Kisi> kisiler= new ArrayList<>();
		kisiler.add(kisi1);
		kisiler.add(kisi2);
		kisiler.add(kisi3);
		kisiler.add(kisi4);
		kisiler.add(kisi5);
		kisiler.add(kisi6);
		
		
		//kadın olanları farklı bir listeye atıcaz sonra bu listeyi yazdıralım
		
		List<Kisi> kadinOlanlar= kisiler
				.stream()
				.filter(i-> i.getCinsiyet()==ECinsiyet.KADIN)
				.collect(Collectors.toList());
		System.out.println(kadinOlanlar);
		
		//kisileri yaşlarına göre sırayalım ve farklı bir listeye atıp yazalım
		
		List<Kisi> siralanmis = kisiler
				.stream()
				.sorted(Comparator.comparing(Kisi:: getAge)).collect(Collectors.toList());
		System.out.println(siralanmis);
		
		//isim ve yaş değerlerini bir yapısına atıp yazdıralım.
		
		
		Map<String,Integer> yeniListe = kisiler.stream().collect(Collectors.toMap(k-> k.getName(), k-> k.getAge()));
		yeniListe.forEach((key,value)->System.out.println(key+" "+value ));
		kisiler.stream().filter(k-> k.getAge()>50).forEach(k->k.elliYasUstu());
	}

}
