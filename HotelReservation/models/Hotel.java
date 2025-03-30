package models;

import java.util.ArrayList;

public class Hotel {
    private String nama;
    private ArrayList<Kamar> daftarKamar = new ArrayList<>();

    public Hotel(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void tambahKamar(Kamar kamar) {
        daftarKamar.add(kamar);
    }

    public Kamar cariKamarTersedia() {
        for (Kamar k : daftarKamar) {
            if (k.isTersedia()) {
                return k;
            }
        }
        return null;
    }
}
