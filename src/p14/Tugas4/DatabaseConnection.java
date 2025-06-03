package p14.Tugas4;

public class DatabaseConnection {
    // Variabel static untuk menyimpan URL koneksi ke database
    public static String connectionString;

    // static block untuk menginisialisasi connectionString
    static {
        connectionString = "jdbc:mysql://localhost:3306/mydatabase";
        System.out.println("static block dijalankan: Connection string telah diinisiasisasi");
    }
}
