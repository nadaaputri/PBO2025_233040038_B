package p13;

public class Tabung extends Bentuk {
    private double tinggi;
    private double radius;

    public void gambar() {
        System.out.println("Menggambar Tabung");
    }

    public Tabung(double radius, double tinggi) {
        this.radius = radius;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungLuas() {
        return 2 * PHI * radius * (radius + tinggi);
    }
}
