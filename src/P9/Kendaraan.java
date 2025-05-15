package P9;

public class Kendaraan {
    protected String merk;
    protected String warna;

    public Kendaraan(String merk, String warna) {
        this.merk = merk;
        this.warna = warna;
    }
    
    public String getMerk() {
        return merk;
    }
    
    public String getWarna() {
        return warna;
    }
}
