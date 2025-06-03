package p13;

public class Lingkaran extends Bentuk {
    public double radius;

    public Lingkaran(double radius) {
        this.radius = radius;
    }

    public void gambar() {
        System.out.println("Menggambar Lingkaran");
    }

    @Override
    public double hitungLuas() {
        return PHI * radius * radius;
    }

}
