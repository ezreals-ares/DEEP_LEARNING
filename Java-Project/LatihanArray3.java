import java.util.Scanner;

public class LatihanArray3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] Bulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};

        System.out.print("Masukkan Angka 1-12: ");
        int angka = sc.nextInt();

        // Membuat Validasi
        if (angka > 0 && angka <= 12) {
            System.out.println("Bulan ke-" + angka + " adalah bulan " + Bulan[angka - 1]);
        } else {
            System.out.println("Bulan ke-" + angka + " tidak ditemukan");
        }

        sc.close();
    }
}
