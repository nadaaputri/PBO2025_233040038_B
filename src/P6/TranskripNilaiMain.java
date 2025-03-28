package P6;

public class TranskripNilaiMain {
	public static void main (String[] args) {
		//Create objek dosen
		Dosen dosen1 = new Dosen("1987654321", "DR.IR LEONY LIDYA,MT");
		Dosen dosen2 = new Dosen("1987654322", "FAJAR DARMAWAN,ST.,M.KOM");
		Dosen dosen3 = new Dosen("1987654323", "Siroj Nur Ulum, S.T.,M.T.");
		
		//Create objek matakuliah dengan dosen pengampu
		Matakuliah mk1 = new Matakuliah("001", "Algoritma Pemrograman 1", "A", 3, dosen1);
		Matakuliah mk2 = new Matakuliah("002", "Algoritma Pemrograman 2", "BC", 3, dosen2);
		Matakuliah mk3 = new Matakuliah("003", "Pemrograman Berorientasi Objek", "B", 3, dosen3);
		
		//Create objek KHS
		KartuHasilStudi khs = new KartuHasilStudi("2022");
		khs.addMatakuliah(mk1);
		khs.addMatakuliah(mk2);
		khs.addMatakuliah(mk3);
		khs.hitungIPS();
		
		//Create objek mahasiswa
		Mahasiswa mhs = new Mahasiswa("303040001", "Jhon");
		
		//Create objek TranskripNilai
		TranskripNilai transkrip = new TranskripNilai(mhs, "2022");
		transkrip.addKHS(khs);
		transkrip.hitungIPK();
		transkrip.display();
	}

}
