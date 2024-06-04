
package main;


public class hotelA {

   
    public static void main(String[] args) {
            // Membuat objek
        hotelUtama hotel1 = new hotelUtama("pyramid" , "*5",10,1000000,"hotel A");
        hotelUtama hotel2 = new hotelUtama("crystal", "*3", 1000, 500000, "hotel B");

        // Menampilkan detail
        hotel1.tampilkan();
        hotel1.setNama("A");
        hotel1.tampilkan();
        System.out.println(hotel1.getpenyewaan());
        hotel2.tampilkan();
    }
    
}
