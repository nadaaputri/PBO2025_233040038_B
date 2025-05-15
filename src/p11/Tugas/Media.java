package p11.Tugas;

public abstract class Media {
    String judul;
    double durasi; // dalam menit

    Media(String judul, double durasi) {
        this.judul = judul;
        this.durasi = durasi;
    }

    abstract void play();

    abstract void pause();

    abstract void stop();
}
