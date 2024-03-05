/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methodpenjumlahanderet;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class MethodPenjumlahanDeret {

    // Fungsi untuk menghitung penjumlahan deret
    public static int hitungPenjumlahanDeret(int n) {
        int hasil = 0;
        for (int i = 1; i <= n; i++) {
            hasil += i;
        }
        return hasil;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Membaca nilai N dari pengguna
        System.out.print("Masukkan nilai N: ");
        int n = input.nextInt();

        // Menampilkan hasil penjumlahan deret
        System.out.print("Hasil penjumlahan deret 1");
        for (int i = 2; i <= n; i++) {
            System.out.print("+" + i);
        }
        System.out.println(" = " + hitungPenjumlahanDeret(n));
    }
}
