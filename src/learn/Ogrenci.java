package learn;

import java.util.Random;

public class Ogrenci {

	private String adi;

	private int id;

	public Ogrenci(String adi, int id) {

		this.adi = adi;

		this.id = id;
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Ogrenci [adi=" + adi + ", id=" + id + "]";
	}

	public void sinavNotu() {
		Random r= new Random();
		System.out.println("Öğrenci: "+ this.adi+" Sinav notu: "+r.nextInt(0,100));
	}
}
