package P9;

public class Mahasiswa extends Orang {
	private String nrp;

	public Mahasiswa(String nrp, String nama, String alamat) {
		super(nama, alamat);
		setNrp(nrp);
		// TODO Auto-generated constructor stub
	}

	public String getNrp() {
		return nrp;
	}

	public void setNrp(String nrp) {
		this.nrp = nrp;
	}

}
