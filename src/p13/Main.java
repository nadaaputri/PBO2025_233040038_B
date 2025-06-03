package p13;

public class Main {
    public static void main(String[] args) {
        Bentuk b1 = new Lingkaran(7);
        Bentuk b2 = new Tabung(14, 5);

        b1.gambar();
        b2.gambar();
        System.out.println("Luas lingkaran: " + b1.hitungLuas());
        System.out.println("Luas Tabung: " + b2.hitungLuas());
    }
}
