/**
 * Kelas yang merepresentasikan barang di toko bangunan.
 */
public class Barang implements TokoBangunan {
    private String namaBarang;
    private int stok;
    private double harga;

    /**
     * Membangun objek Barang baru dengan nama, stok, dan harga yang ditentukan.
     *
     * @param namaBarang Nama barang.
     * @param stok       Stok barang yang tersedia.
     * @param harga      Harga barang.
     */
    public Barang(String namaBarang, int stok, double harga) {
        this.namaBarang = namaBarang;
        this.stok = stok;
        this.harga = harga;
    }

    /**
     * Menghitung total harga untuk jumlah barang yang ditentukan.
     *
     * @param jumlah Jumlah barang untuk menghitung total harga.
     * @return Total harga untuk jumlah barang yang ditentukan.
     */
    public double hitungTotalHarga(int jumlah) {
        return harga * jumlah;
    }


    /**
     * Mengurangi stok barang sesuai jumlah yang diberikan jika stok mencukupi.
     *
     * @param jumlah Jumlah pengurangan dari stok.
     */
    public void kurangiStok(int jumlah) {
        if (jumlah <= stok) {
            stok -= jumlah;
        } else {
            System.out.println("Stok tidak mencukupi.");
        }
    }

    /**
     * Menampilkan informasi barang, termasuk nama, stok, dan harga.
     */
    @Override
    public void tampilkanInfo() {
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Stok: " + stok);
        System.out.println("Harga: " + harga);
    }

    /**
     * Mengembalikan nama barang.
     *
     * @return Nama barang.
     */
    public String getNamaBarang() {
        return namaBarang;
    }

    /**
     * Mengembalikan stok barang yang tersedia.
     *
     * @return Stok barang yang tersedia.
     */
    public int getStok() {
        return stok;
    }

    /**
     * Mengembalikan harga barang.
     *
     * @return Harga barang.
     */
    public double getHarga() {
        return harga;
    }
}
