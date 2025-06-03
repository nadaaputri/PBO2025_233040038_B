package p14.Tugas2;

public class SavingAccount extends BankAccount {
    public SavingAccount(String accountNumber) {
        super(accountNumber);
    }

    // ini akan menyebabkan error karena method displayAccountInfo() final

    public void displayAccountInfo() {
        System.out.println("Saving Account Info:");
    }

    // Untuk menangani kebutuhan khusus pada subclass tanpa mengubah method final,
    // membuat method baru dan memanggil method final
    public void displaySavings() {
        super.displayAccountInfo();
        System.out.println("Informasi rekening tabungan");
    }
}
