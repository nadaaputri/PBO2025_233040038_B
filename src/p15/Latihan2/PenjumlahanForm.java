package p15.Latihan2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class PenjumlahanForm extends JFrame {
    private JTextField textField1, textField2;
    private JButton tombolJumlah;

    public PenjumlahanForm() {
        // inisialisasi komponen
        textField1 = new JTextField(10);
        textField2 = new JTextField(10);
        tombolJumlah = new JButton("Jumlah");

        // tambahkan action listener ke tombol
        tombolJumlah.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int angka1 = Integer.parseInt(textField1.getText());
                    int angka2 = Integer.parseInt(textField2.getText());
                    int hasil = angka1 + angka2;

                    JOptionPane.showMessageDialog(null, "Jumlah: " + hasil, "Message", JOptionPane.INFORMATION_MESSAGE);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Input harus berupa angka!", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Layout komponen
        setLayout(new FlowLayout());
        add(textField1);
        add(textField2);
        add(tombolJumlah);

        // Pengaturan JFrame
        setTitle("Penjumlahan");
        setSize(200, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // Method main
    public static void main(String[] args) {
        new PenjumlahanForm();
    }

}
