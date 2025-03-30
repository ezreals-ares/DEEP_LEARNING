package Praktikum_ASD.CASE_METHOD1;

import java.util.Scanner;

public class Sistem_Akademik {

    public static void main(String[] args) {
        
        Mahasiswa[] daftarMahasiswa = new Mahasiswa[3];
        daftarMahasiswa[0] = new Mahasiswa("22001", "Ali Rahman", "Informatika");
        daftarMahasiswa[1] = new Mahasiswa("22002", "Budi Santoso", "Informatka");
        daftarMahasiswa[2] = new Mahasiswa("22003", "Citra Dewi", "Sistem Informasi Bisnis");

        MataKuliah[] daftarMataKuliah = new MataKuliah[3];
        daftarMataKuliah[0] = new MataKuliah("MK001", "Struktur Data", 3);
        daftarMataKuliah[1] = new MataKuliah("MK002", "Basis Data", 3);
        daftarMataKuliah[2] = new MataKuliah("MK003", "Desain Web", 3);

        Penilaian[] daftarPenilaian = new Penilaian[5];
        daftarPenilaian[0] = new Penilaian(daftarMahasiswa[0], daftarMataKuliah[0], 80, 85, 90);
        daftarPenilaian[1] = new Penilaian(daftarMahasiswa[0], daftarMataKuliah[1], 60, 75, 70);
        daftarPenilaian[2] = new Penilaian(daftarMahasiswa[1], daftarMataKuliah[0], 75, 70, 80);
        daftarPenilaian[3] = new Penilaian(daftarMahasiswa[2], daftarMataKuliah[1], 85, 90, 95);
        daftarPenilaian[4] = new Penilaian(daftarMahasiswa[2], daftarMataKuliah[2], 70, 75, 80);

        Scanner sc = new Scanner(System.in);
        int pilihMenu;

        do {
            System.out.println("\n==== MENU SISTEM AKADEMIK ====");
            System.out.println("1. Tampilkan Data Mahasiswa");
            System.out.println("2. Tampilkan Data Mata Kuliah");
            System.out.println("3. Tampilkan Data Penilaian");
            System.out.println("4. Urutkan Mahasiswa Berdasarkan Nilai Akhir");
            System.out.println("5. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu: ");
            pilihMenu = sc.nextInt();
            System.out.println();

            switch(pilihMenu) {
                case 1:
                    for(Mahasiswa mhs : daftarMahasiswa) {
                        mhs.tampilMahasiswa();
                    }
                    break;

                case 2:
                    for(MataKuliah mk : daftarMataKuliah) {
                        mk.tampilMataKuliah();
                    }
                    break;

                case 3:
                    for(Penilaian p : daftarPenilaian) {
                        p.tampilPenilaian();
                    }
                    break;

                case 4:
                    for(int i = 0; i < daftarPenilaian.length - 1; i++) {
                        for(int j = i + 1; j < daftarPenilaian.length; j++) {
                            if (daftarPenilaian[i].nilaiAkhir < daftarPenilaian[j].nilaiAkhir) {
                                Penilaian temp = daftarPenilaian[i];
                                daftarPenilaian[i] = daftarPenilaian[j];
                                daftarPenilaian[j] = temp;
                            }
                        }
                    }

                    for(Penilaian p : daftarPenilaian) {
                        p.tampilPenilaian();
                    }
                    break;
                
                case 5:
                    System.out.print("Masukkan NIM: ");
                    String nimCari = sc.next();
                    int index = sequentialSearchMahasiswa(nimCari, daftarMahasiswa);
                    if (index != -1) {
                        daftarMahasiswa[index].tampilMahasiswa();
                    } else {
                        System.out.println("Mahasiswa tidak ditemukan");
                    }
                    break;

                case 0:
                    System.out.println("Keluar dari Sistem Akademik");
                    break;

                default:
                    System.out.println("Pilihan tidak valid");
               
            }
        } while (pilihMenu != 0);

        sc.close();
    }

    static int sequentialSearchMahasiswa(String nim, Mahasiswa[] daftarMahasiswa) {
        for(int i = 0; i < daftarMahasiswa.length; i++) {
            if (daftarMahasiswa[i].NIM.equals(nim)) {
                return i;
            }
        }
        return -1;
    }
}