import java.util.Scanner;

public class Algoritm2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int nilaiEks1, nilaiEks2, nilaiEks3;
        int nilaiNonEks1, nilaiNonEks2;
        int ratatotaleks, ratatotalnoneks;
        String pilihan;

        System.out.print("Masukkan nilai eks 1: ");
        nilaiEks1 = sc.nextInt();
        System.out.print("Masukkan nilai eks 2: ");
        nilaiEks2 = sc.nextInt();
        System.out.print("Masukkan nilai eks 3: ");
        nilaiEks3 = sc.nextInt();

        System.out.print("Masukkan niali non eks 1: ");
        nilaiNonEks1 = sc.nextInt();
        System.out.print("Masukkan niali non eks 2: ");
        nilaiNonEks2 = sc.nextInt();

        ratatotaleks = (nilaiEks1 + nilaiEks2 + nilaiEks3) /3;
        ratatotalnoneks = (nilaiNonEks1 + nilaiNonEks2) /2;

        if (ratatotaleks > ratatotalnoneks) {
            System.out.println("Siswa masuk ke IPA");
        } else if (ratatotaleks < ratatotalnoneks) {
            System.out.println("Siswa masuk ke IPS");
        } else if (ratatotaleks == ratatotalnoneks) {
            sc.nextLine();
            System.out.print("pilih IPA/IPS: ");
            pilihan = sc.nextLine();
            System.out.print("Pilihan Siswa ke: " + pilihan);
        }

        sc.close();



    }
}