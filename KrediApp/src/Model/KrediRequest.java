package Model;

public class KrediRequest {
	private Musteri musteriBilgileri;
	private Boolean kartTalebiVarMi;
	public Musteri getMusteriBilgileri() {
		return musteriBilgileri;
	}

	public void setMusteriBilgileri(Musteri musteriBilgileri) {
		this.musteriBilgileri = musteriBilgileri;
	}

	public Boolean getKartTalebiVarMi() {
		return kartTalebiVarMi;
	}

	public void setKartTalebiVarMi(Boolean kartTalebiVarMi) {
		this.kartTalebiVarMi = kartTalebiVarMi;
	}

}
