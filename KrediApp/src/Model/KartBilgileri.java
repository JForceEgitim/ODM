package Model;

public class KartBilgileri {
	private String kartTuru;
	private int kartLimiti = 0 ;
	private int kartBakiyesi = 0;

	public String getKartTuru() {
		return kartTuru;
	}

	public void setKartTuru(String kartTuru) {
		this.kartTuru = kartTuru;
	}

	public int getKartLimiti() {
		return kartLimiti;
	}

	public void setKartLimiti(int kartLimiti) {
		this.kartLimiti = kartLimiti;
	}

	public int getKartBakiyesi() {
		return kartBakiyesi;
	}

	public void setKartBakiyesi(int kartBakiyesi) {
		this.kartBakiyesi = kartBakiyesi;
	}

}
