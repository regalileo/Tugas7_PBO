package models;

public abstract class Kamar {
    private String nomorKamar;
    private boolean tersedia;

    public Kamar(String nomorKamar) {
        this.nomorKamar = nomorKamar;
        this.tersedia = true;
    }

    public String getNomorKamar() {
        return nomorKamar;
    }

    public boolean isTersedia() {
        return tersedia;
    }

    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }

    public abstract double getHarga();
}
