/**
 * Kelas yang merepresentasikan transaksi pembelian di toko bangunan.
 */
public class Pembelian implements TokoBangunan {
    private String namaPembeli;
    private Barang barang;
    private int jumlah;
    private double totalHarga;

    /**
     * Membangun objek Pembelian baru dengan nama pembeli, barang, dan jumlah yang ditentukan.
     * Menghitung total harga secara otomatis dan mengurangi stok barang.
     *
     * @param namaPembeli Nama pembeli.
     * @param barang      Barang yang dibeli.
     * @param jumlah      Jumlah barang yang dibeli.
     */
    public Pembelian(String namaPembeli, Barang barang, int jumlah) {
        this.namaPembeli = namaPembeli;
        this.barang = barang;
        this.jumlah = jumlah;
        this.totalHarga = barang.hitungTotalHarga(jumlah);
        barang.kurangiStok(jumlah);  // Mengurangi stok setelah pembelian
    }

    /**
     * Menampilkan informasi pembelian, termasuk nama pembeli, nama barang, jumlah, dan total harga.
     */
    @Override
    public void tampilkanInfo() {
        System.out.println("Nama Pembeli: " + namaPembeli);
        System.out.println("Barang Dibeli: " + barang.getNamaBarang());
        System.out.println("Jumlah: " + jumlah);
        System.out.println("Total Harga: " + totalHarga);
    }
}