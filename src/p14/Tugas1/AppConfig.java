package p14.Tugas1;

public class AppConfig {
    // Penggunaan 'public' artinya dapat diakses dari mana saja dalam aplikasi
    // Penggunaan 'static' artinya milik kelas, tidak perlu membuat objek untuk
    // mengaksesnya
    // Penggunaan 'final' artinya nilainya tetap, tidak bisa diubah setelah
    // inisialisasi.
    public static final String BASE_URL = "https://www.myapp.com/api";
    // konstanta versi aplikasi yang bersifat global dan tidak berubah
    public static final String APP_VERSION = "1.0.0";
    // konstanta timeout default (dalam milidetik), digunakan oleh seluruh aplikasi
    public static final int DEFAULT_TIMEOUT = 5000;

}
