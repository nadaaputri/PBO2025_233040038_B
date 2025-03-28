package P5;

public class Matakuliah {
	private String kode;
	private String nama;
	private String index;
	private int sks;
	
	//konstruktor
	public Matakuliah(String kode, String nama, String index, int sks) {
		super();
		this.kode = kode;
		this.nama = nama;
		this.index = index;
		this.sks = sks;
	}
	
	public int getsks() {
		return sks;
	}
	
	public double nilaiIndex() {
		//Berdasarkan index matakuliah
		//A = 4, AB = 3.5, B = 3, BC = 2.5, C = 2, D = 1, E = 0
		if(index == "A") {
			return 4;
		} 
		if(index == "AB") {
			return 3.5;
		} 
		if(index == "B") {
			return 3;
		} 
		if(index == "BC") {
			return 2.5;
		}
		if(index == "C") {
			return 2;
		} 
		if(index == "D") {
			return 1;
		} 
		else {
			return 0;
		}
	}
	
	public String display() {
		return kode + " - " + nama + " - " + index;
	}
}
