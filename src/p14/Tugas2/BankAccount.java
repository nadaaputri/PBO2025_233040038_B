package p14.Tugas2;

import java.security.KeyStore.ProtectionParameter;

public class BankAccount {
    // Variabel 'final hanya bisa diinisialisasi sekali (saat pemanggilan
    // constructor)'
    // Memastikan nomor rekening tidak bisa diubah setelah objek dibuat
    private final String accountNumber;
    // 'balance' bersifat 'protected', agar bisa diakses oleh subclass
    protected double balance;

    // Constructor untuk menginisialisasi accountNumber dan balance
    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    // Method untuk menambah saldo, hanya menambah jika nilai yang diberikan positif
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Method ini diberi keyword 'final', artinya tidak boleh di-override di
    // subclass
    // Ini penting untuk menjaga informasi rekening agar tidak bisa dimodifikasi
    // sembarangan
    public final void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}
