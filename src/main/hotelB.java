
package main;


public class hotelB extends hotelUtama{
    
    public hotelB(String nama, String jenis, int jumlahKamar, int hargaPerMalam, String penyewaan) {
        super(nama, jenis, jumlahKamar, hargaPerMalam, penyewaan);
        this.jumlahKamar = 100;
    }
    
}
