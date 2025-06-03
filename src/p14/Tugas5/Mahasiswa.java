package p14.Tugas5;

public class Mahasiswa {
    // NIM bersifat tetap (final)
    private final String nim;
    // Nama dapat diubah
    private String nama;
    // Variabel static untuk menghitung jumlah mahasiswa
    private static int totalMahasiswa = 0;
    // Konstanta maksimum SKS
    public static final int maxSKS = 24;

    // Konstruktor
    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        totalMahasiswa++; // total mahasiswa bertambah setiap objek dibuat
    }

    // Method untuk menampilkan info mahasiswa
    public void displayInfo() {
        System.out.println("NIM : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Maksimum SKS : " + maxSKS);
        System.out.println("--------------------------");
    }

    // Method static untuk mengambil total mahasiswa
    public static int getTotalMahasiswa() {
        return totalMahasiswa;
    }
}
