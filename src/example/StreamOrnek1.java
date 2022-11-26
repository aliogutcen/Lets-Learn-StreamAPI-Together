package example;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamOrnek1 {

	public static void main(String[] args) {
		
		List<User> users =new ArrayList<>();

		
		users.add(new User("Ali", 4));
		users.add(new User("Melih", 31));
		users.add(new User("Kaan", 25));
		users.add(new User("Buse", 34));
		users.add(new User("Mert", 15));
		users.add(new User("Tayfun", 12));
		users.add(new User("Ahmet", 87));
		
		
		
		users.stream().forEach(user-> System.out.println(user.toString())); // bütün userlerin toString metodunu çağırmak için bu satırı yazdık
		
		users.stream().forEach(a-> a.bilgileriGoster());  //her bir user için bilgileri goster methodunu kullandık. foreach ile içinde döndük.
		
		//id'si 3ten büyük olanları bir listeye atalım ve bu liste içindeki userleri bilgiler yazdır methodunu kullanalım.
		
		List<User> yeniUserListe = users.stream().filter(user-> user.getId()>30).collect(Collectors.toList());
		System.out.println("\n**** Bilgileri Goster ****\n");
		yeniUserListe.stream().forEach(user-> user.bilgileriGoster());
		
		//id'si 30dan küçükleri bir sete atalım ve bu seti yazdıralım
		
		
		Set<User> yeniUserAtamasi= users.stream().filter(us-> us.getId()<30).collect(Collectors.toSet());
		yeniUserAtamasi.stream().forEach(User:: bilgileriGoster);
		
		
		
		//adı Ahmet olanları farklı bir listeye atalım daha sonra bu listeyi yazıdralım.
		
		
		List<User> ismiAhmet= users.stream().filter(user-> user.getAdi().trim().equalsIgnoreCase("ahmet")).collect(Collectors.toList());
		System.out.println("\n**** Bilgileri Goster ****\n");
		ismiAhmet.stream().forEach(use-> System.out.println(use.toString()));
		
		//her bir user için yeni bir user nesnesi oluşturalım
		//parametre olarak id ve isimlerini alsınlar
		// isimlerinin sonuna!! ekleyelim.
		//yeni listeye atalım.
		
		List<User> yepYeni= users.stream().map(user-> new User(user.getAdi()+"!!",user.getId()) ).collect(Collectors.toList());
		yepYeni.stream().forEach(us-> us.bilgileriGoster());
		
	}

}
