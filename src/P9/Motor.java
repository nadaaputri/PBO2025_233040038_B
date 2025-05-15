package P9;

public class Motor extends Kendaraan {
	private String noPlat;

    public Motor(String noPlat, String merk, String warna) {
        super(merk, warna);
        this.noPlat = noPlat;
    }

    public String getNoPlat() {
        return noPlat;
    }

    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }
}
