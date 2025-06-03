package p14.Tugas5;

public class TestMahasiswa {
    public static void main(String[] args) {
        // Membuat objek Mahasiswa
        Mahasiswa m1 = new Mahasiswa("23301", "Nada");
        Mahasiswa m2 = new Mahasiswa("23302", "Reza");
        Mahasiswa m3 = new Mahasiswa("23303", "Putri");

        // Menampilkan informasi masing-masing Mahasiswa
        m1.displayInfo();
        m2.displayInfo();
        m3.displayInfo();

        // Menampilkan total mahasiswa yang telah dibuat
        System.out.println("Total Mahasiswa Terdaftar: " + Mahasiswa.getTotalMahasiswa());
    }
}
