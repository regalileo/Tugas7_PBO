// jawaban soal no 2

package Mahasiswa;

import java.util.ArrayList;
import java.util.ArrayDeque;

public class DataMahasiswa {
    public static void main(String[] args) {
        // Menggunakan ArrayList untuk menyimpan daftar mahasiswa
        ArrayList<String> daftarMahasiswa = new ArrayList<>();
        daftarMahasiswa.add("Regal Nugaraha");
        daftarMahasiswa.add("Amelia");
        daftarMahasiswa.add("Nabila");

        System.out.println("Daftar Mahasiswa (ArrayList):");
        for (String nama : daftarMahasiswa) {
            System.out.println(nama);
        }

        // Menggunakan ArrayDeque sebagai struktur data antrian mahasiswa
        ArrayDeque<Integer> antrianMahasiswa = new ArrayDeque<>();
        antrianMahasiswa.add(101);
        antrianMahasiswa.add(102);
        antrianMahasiswa.add(103);

        System.out.println("\nAntrian Mahasiswa (ArrayDeque):");
        while (!antrianMahasiswa.isEmpty()) {
            System.out.println("Mahasiswa dengan ID " + antrianMahasiswa.poll() + " diproses.");
        }
    }
}
