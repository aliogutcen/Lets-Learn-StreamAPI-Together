package example;

public class User {

	private String adi;
	private int id;
	
	public User(String adi, int id) {
		
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
		return "User [adi=" + adi + ", id=" + id + "]";
	}
	
	public void bilgileriGoster() {
		System.out.println("adı= "+this.adi);
	}
	
	
}
