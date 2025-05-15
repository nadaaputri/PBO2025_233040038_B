package p11.Tugas;

public class Main {
    public static void main(String[] args) {
        Lagu l = new Lagu("Hati-Hati di Jalan", 3.43);
        Podcast p = new Podcast("PODHUB", 50.43);

        l.play();
        l.tambahKeFavorit();
        l.stop();

        System.out.println();

        p.play();
        p.tambahKeFavorit();
        p.stop();
    }
}
