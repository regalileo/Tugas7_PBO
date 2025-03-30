package main;

import models.*;
import services.*;

public class MainApp {
    public static void main(String[] args) {
        // Buat hotel & kamar
        Hotel hotel = new Hotel("Grand Java Hotel");
        hotel.tambahKamar(new DeluxeRoom("101"));
        hotel.tambahKamar(new SuiteRoom("202"));

        // Buat pelanggan
        Pelanggan pelanggan1 = new Pelanggan();

        // Cari kamar yang tersedia
        Kamar kamarTersedia = hotel.cariKamarTersedia();
        if (kamarTersedia != null) {
            // Buat reservasi
            Reservasi<Kamar> reservasi = new Reservasi<>(pelanggan1, kamarTersedia, 2);
            reservasi.tampilkanDetail();

            // Proses pembayaran
            Pembayaran pembayaran = new PembayaranKartu("1234-5678-9101-1121");
            pembayaran.prosesPembayaran(reservasi.hitungTotalBiaya());
        } else {
            System.out.println("Maaf, tidak ada kamar tersedia.");
        }
    }
}
