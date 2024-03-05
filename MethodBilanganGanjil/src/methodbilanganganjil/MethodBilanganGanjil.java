/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methodbilanganganjil;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class MethodBilanganGanjil {

    // Fungsi untuk menghitung jumlah bilangan ganjil
    public static int hitungBilanganGanjil(int batasAwal, int batasAkhir) {
        int jumlahGanjil = 0;
        System.out.print("Bilangan ganjil antara " + batasAwal + " dan " + batasAkhir + " yaitu: ");
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (i % 2 != 0) {
                jumlahGanjil++;
                System.out.print(i + " ");
            }
        }
        System.out.println(); // Menambahkan baris baru setelah menampilkan bilangan ganjil
        return jumlahGanjil;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Membaca batasAwal dan batasAkhir dari pengguna
        System.out.print("Masukkan batas awal: ");
        int batasAwal = input.nextInt();
        System.out.print("Masukkan batas akhir: ");
        int batasAkhir = input.nextInt();

        // Memanggil fungsi hitungBilanganGanjil dan menampilkan hasilnya
        int jumlahGanjil = hitungBilanganGanjil(batasAwal, batasAkhir);
        System.out.println("Jumlah bilangan ganjil antara " + batasAwal + " dan " + batasAkhir + " adalah: " + jumlahGanjil);
    }
}
