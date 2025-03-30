package models; 

public class Pelanggan {
    private String nama;
    private String nomorTelepon;

    // Constructor default (tanpa parameter)
    public Pelanggan() {
        this.nama = "";
        this.nomorTelepon = "";
    }

    // Constructor dengan parameter
    public Pelanggan(String nama, String nomorTelepon) {
        this.nama = nama;
        this.nomorTelepon = nomorTelepon;
    }

    public String getNama() {
        return nama;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }
}
