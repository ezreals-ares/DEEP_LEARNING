package Praktikum_ASD.CASE_METHOD1;

public class Mahasiswa {

    String NIM;
    String nama;
    String prodi;

    public Mahasiswa(String nim, String name, String prodi) {
        this.NIM = nim;
        this.nama = name;
        this.prodi = prodi;
    }

    void tampilMahasiswa() {
        System.out.print("NIM: " + NIM + " | Nama: " + nama + " | Prodi: " + prodi + "\n");
    }

   
}