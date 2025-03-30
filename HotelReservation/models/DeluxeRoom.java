package models;

public class DeluxeRoom extends Kamar {
    public DeluxeRoom(String nomorKamar) {
        super(nomorKamar);
    }

    @Override
    public double getHarga() {
        return 500000; // Harga per malam
    }
}
