package example.ornek2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiOrnek2 {

	public static void main(String[] args) {
		//5ile bölünen sayıları bir listeye atalım ve listeyi yazdıralım.

		
		List<Integer> sayilar= new ArrayList<>();
		sayilar.add(48);
		sayilar.add(30);
		sayilar.add(25);
		sayilar.add(15);
		sayilar.add(13);
		
		
		List<Integer> bolunenler= sayilar.stream().filter(i->i%5==0).collect(Collectors.toList());
		System.out.println(bolunenler);
		
		//sayıları kendileri ile çarpıp listeye atalım
		
		List<Integer> carpimlari= sayilar.stream().map(i-> i*i).collect(Collectors.toList());
		System.out.println(carpimlari);
		
		//kaç tane 5 e bölünen sayı var bulmaya çalışalım
		
		long sayalim = sayilar.stream().filter(i-> i%5==0).count();
		System.out.println(sayalim);
	}

}
