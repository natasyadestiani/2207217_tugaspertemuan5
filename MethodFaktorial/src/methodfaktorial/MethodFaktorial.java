/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methodfaktorial;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class MethodFaktorial {

    // Fungsi untuk menghitung faktorial dari n
    public static int hitungFaktorial(int n) {
        if (n == 0) {
            return 1; // Jika n adalah 0, maka hasilnya adalah 1
        } else {
            int faktorial = 1;
            for (int i = n; i >= 1; i--) {
                faktorial *= i;
            }
            return faktorial;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Membaca nilai n dari pengguna
        System.out.print("Masukkan nilai n: ");
        int n = input.nextInt();

        // Memanggil fungsi hitungFaktorial untuk menghitung nilai faktorial dari n
        int hasilFaktorial = hitungFaktorial(n);

        // Menampilkan hasil faktorial
        System.out.print(n + "!=");
        for (int i = n; i >= 1; i--) {
            System.out.print(i);
            if (i != 1) {
                System.out.print("*");
            }
        }
        System.out.println("=" + hasilFaktorial);
    }
}
