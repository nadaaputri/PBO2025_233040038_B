package P6;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TranskripNilai {

	private Date tglCetak;
	private double ipk = 0.0;
	private List<KartuHasilStudi> kartuHasilStudi;
	private Mahasiswa mahasiswa;
	private String semester;  //Menambahkan atribut semester
	
	public TranskripNilai(Mahasiswa mahasiswa, String semester) {
		super();
		this.mahasiswa = mahasiswa;
		this.semester = semester;
		
		kartuHasilStudi = new ArrayList<KartuHasilStudi>();
		tglCetak = new Date();
	}
	
	public String getSemester() {
		return semester;
	}
	
	public void hitungIPK() {
		double totalNilai = 0;
		int totalSKS = 0;
		
        for (KartuHasilStudi khs : kartuHasilStudi) {
            khs.hitungIPS(); 
            totalNilai += khs.getIPS() * getTotalSKS(khs);
            totalSKS += getTotalSKS(khs);
        }
        
        if(totalSKS > 0) {
        	this.ipk = totalNilai / totalSKS;
        } else {
        	this.ipk = 0;
        }
	}
	
	public void addKHS(KartuHasilStudi khs) {
		kartuHasilStudi.add(khs);
	}
	
	public void display() {
		System.out.println(mahasiswa.display());
		System.out.println("Semester: " + semester);
		System.out.println("Tanggal Cetak: "+ tglCetak.toString());
		System.out.println("IPK: "+ ipk);
		for (KartuHasilStudi khs : kartuHasilStudi) {
			System.out.println(khs.display());
		}
	}
	
	public int getTotalSKS(KartuHasilStudi khs) {
		int totalSKS = 0;
		for (Matakuliah mk : khs.getDaftarMatakuliah()) {
			totalSKS += mk.getsks();
		}
		return totalSKS;
	}
	
	public double getIpk() {
		return ipk;
	}
	
	public Date getTglCetak() {
		return tglCetak;
	}
	
	public Mahasiswa getMahasiswa() {
		return mahasiswa;
	}
	
	public List<KartuHasilStudi> getKartuHasilStudi(){
		return kartuHasilStudi;
	}
}
