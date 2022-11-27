package example3;

public enum EUrun {

	Sut(20), Ekmek(15), Seker(60),Yağ(200),Un(50),Çay(60),Yumurta(14),Yoğurt(22);

	double fiyat;

	public double getFiyat() {
		return fiyat;
	}

	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}

	private EUrun(double fiyat) {
		this.fiyat = fiyat;
	}

}
