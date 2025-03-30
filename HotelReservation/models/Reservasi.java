package models;

public class Reservasi<T extends Kamar> {
    private Pelanggan pelanggan;
    private T kamar;
    private int durasiMalam;

    public Reservasi(Pelanggan pelanggan, T kamar, int durasiMalam) {
        this.pelanggan = pelanggan;
        this.kamar = kamar;
        this.durasiMalam = durasiMalam;
        kamar.setTersedia(false);
    }

    public double hitungTotalBiaya() {
        return kamar.getHarga() * durasiMalam;
    }

    public void tampilkanDetail() {
        System.out.println("Reservasi:");
        System.out.println("Pelanggan: " + pelanggan.getNama());
        System.out.println("Kamar: " + kamar.getNomorKamar());
        System.out.println("Durasi: " + durasiMalam + " malam");
        System.out.println("Total: Rp " + hitungTotalBiaya());
    }
}
