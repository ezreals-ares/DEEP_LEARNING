import java.util.Scanner;

public class Algoritm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama;
        int nilaiMK1, nilaiMK2;
        int rataTotal;
        byte rataMinim = 60;

        System.out.print("Masukkan nama: ");
        nama = sc.nextLine();

        System.out.print("Masukkan nilai MK1: ");
        nilaiMK1 = sc.nextInt();

        System.out.print("Masukkan nilai MK2: ");
        nilaiMK2 = sc.nextInt();

        rataTotal = (nilaiMK1 + nilaiMK2) /2;

        if (rataTotal >=rataMinim) {
            System.out.println("Mahasiswa dengan nama " + nama + " dinyatakan lulus");
        } else {
            System.out.println("Mahasiswa dengan nama " + nama + " dinyatakan tidak lulus");
        }

        sc.close();
        
    }

    
    
}