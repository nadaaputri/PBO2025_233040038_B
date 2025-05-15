package InheritanceMain;

import P9.Mahasiswa;

public class Main {
	public static void main(String args[]) {
		Mahasiswa mhs = new Mahasiswa("1001", "Ade Sukendar", "Bandung");
		System.out.println(
				mhs.getNrp() + 
				" - " + mhs.getNama() + 
				" - " + mhs.getAlamat()
				);
	}
}
