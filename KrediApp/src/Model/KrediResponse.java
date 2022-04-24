package Model;

public class KrediResponse {

	private Boolean krediOnaylandiMi;
	private String mesaj;
	private int onaylananTutar = 0;
	private int musteriSeviyesi;
	private int toplamOdeme;
	private int kartLimiti;
	private String krediKartıTuru;

	public Boolean getKrediOnaylandiMi() {
		return krediOnaylandiMi;
	}

	public void setKrediOnaylandiMi(Boolean krediOnaylandiMi) {
		this.krediOnaylandiMi = krediOnaylandiMi;
	}

	public String getMesaj() {
		return mesaj;
	}

	public void setMesaj(String mesaj) {
		this.mesaj = mesaj;
	}

	public int getOnaylananTutar() {
		return onaylananTutar;
	}

	public void setOnaylananTutar(int onaylananTutar) {
		this.onaylananTutar = onaylananTutar;
	}

	public int getMusteriSeviyesi() {
		return musteriSeviyesi;
	}

	public void setMusteriSeviyesi(int musteriSeviyesi) {
		this.musteriSeviyesi = musteriSeviyesi;
	}

	public int getToplamOdeme() {
		return toplamOdeme;
	}

	public void setToplamOdeme(int toplamOdeme) {
		this.toplamOdeme = toplamOdeme;
	}

	public int getKartLimiti() {
		return kartLimiti;
	}

	public void setKartLimiti(int kartLimiti) {
		this.kartLimiti = kartLimiti;
	}

	public String getKrediKartıTuru() {
		return krediKartıTuru;
	}

	public void setKrediKartıTuru(String krediKartıTuru) {
		this.krediKartıTuru = krediKartıTuru;
	}

}
