package example3;

public class Urun {

	
	private String name;
	private double fiyat;
	public Urun(String name, double fiyat) {
		super();
		this.name = name;
		this.fiyat = fiyat;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getFiyat() {
		return fiyat;
	}
	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}
	@Override
	public String toString() {
		return "Urun [name=" + name + ", fiyat=" + fiyat + "]";
	}
	
	
	
	
}
