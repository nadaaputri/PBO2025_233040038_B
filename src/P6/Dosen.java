package P6;

public class Dosen {
	private String NIP;
	private String Nama;
	
	public Dosen(String nip, String nama) {
		this.NIP = nip;
		this.Nama = nama;
	}

	public String getNip() {
		return NIP;
	}
	
	public String getNama() {
		return Nama;
	}
	
	public String display() {
		return "Dosen: " + Nama + " (NIP: " + NIP + ")";
	}
}
