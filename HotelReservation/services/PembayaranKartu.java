package services;

public class PembayaranKartu implements Pembayaran {
    private String nomorKartu;

    public PembayaranKartu(String nomorKartu) {
        this.nomorKartu = nomorKartu;
    }

    @Override
    public void prosesPembayaran(double jumlah) {
        System.out.println("Pembayaran kartu dengan nomor " + nomorKartu + " sebesar Rp " + jumlah + " berhasil.");
    }
}
