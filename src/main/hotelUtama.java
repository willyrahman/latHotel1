
package main;


public class hotelUtama {
    private String penyewaan;
    public String nama, jenis;
    public int jumlahKamar, hargaPerMalam, totalBiaya;


    hotelUtama(String nama, String jenis, int jumlahKamar, int hargaPerMalam, String penyewaan) {
        this.nama = nama;
        this.jenis = jenis;
        this.jumlahKamar = jumlahKamar;
        this.hargaPerMalam = hargaPerMalam;
        this.penyewaan = penyewaan;
 
}
 // Metode untuk menghitung total biaya
    int totalBiaya(int jumlahKamar, int hargaPerMalam) {
        return jumlahKamar * hargaPerMalam;
    }

    // Mutator (Setter)
    public void setNama(String namaBaru) {
        this.nama = namaBaru;
    }

    // Accessor (Getter)
    public String getpenyewaan() {
        return this.penyewaan;
    }

    // Metode untuk menampilkan detail PS4
    void tampilkan() {
        System.out.println("\nNama hotel: " + nama);
        System.out.println("Jenis hotel: " + jenis);
        System.out.println("jumlah kamar: " + jumlahKamar);
        System.out.println("harga per malam : " + hargaPerMalam );
        System.out.println("penyewaan " + penyewaan);
        System.out.println("Total Biaya: Rp. " + totalBiaya(this.jumlahKamar, this.hargaPerMalam));
    }
}