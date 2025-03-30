package models;

public class SuiteRoom extends Kamar {
    public SuiteRoom(String nomorKamar) {
        super(nomorKamar);
    }

    @Override
    public double getHarga() {
        return 1000000; // Harga per malam
    }
}
