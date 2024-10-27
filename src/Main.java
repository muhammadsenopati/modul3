/**
 * Kelas utama untuk menjalankan aplikasi toko bangunan.
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data barang dari pengguna
        System.out.print("Masukkan nama barang: ");
        String namaBarang = scanner.nextLine();

        System.out.print("Masukkan stok barang: ");
        int stokBarang = scanner.nextInt();

        System.out.print("Masukkan harga barang: ");
        double hargaBarang = scanner.nextDouble();

        // Membuat objek Barang berdasarkan input pengguna
        Barang barang = new Barang(namaBarang, stokBarang, hargaBarang);
        barang.tampilkanInfo();

        // Input data pembelian dari pengguna
        System.out.print("Masukkan nama pembeli: ");
        scanner.nextLine();  // Membersihkan newline yang tersisa
        String namaPembeli = scanner.nextLine();

        System.out.print("Masukkan jumlah barang yang dibeli: ");
        int jumlahDibeli = scanner.nextInt();

        // Membuat objek Pembelian berdasarkan input pengguna
        Pembelian pembelian = new Pembelian(namaPembeli, barang, jumlahDibeli);
        pembelian.tampilkanInfo();

        // Menampilkan stok setelah pembelian
        System.out.println("Stok barang setelah pembelian:");
        barang.tampilkanInfo();

        scanner.close();  // Menutup scanner
    }
}