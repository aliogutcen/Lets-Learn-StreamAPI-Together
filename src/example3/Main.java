package example3;

public class Main {

	public static void main(String[] args) {
		// EUrun diye bir enum sınıf oluşturalım
		// burada urun ve fiyatlari tutucaz.
		

		
		//sepet sınıfında
		//ürünleri arrayde tutacak şekilde değişkenimizi oluşturalım.
		//aynı se
		
		Sepet sepet1= new Sepet();
		sepet1.urunOlustur();
		sepet1.urunFiyatMapOlustur();
		sepet1.fiyatListesi();
		sepet1.sepeteUrunEkle();
		sepet1.sepeteUrunEkle();
		sepet1.sepetiGoster();
		sepet1.sepetAdedi();
		sepet1.fiyati50denBuyukOlanListele();
		
	}

}
