package OOP;

import java.util.Scanner;

public class dataMhsMain {

    static  dataMhs[] mhs = new dataMhs[3];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        for (int i = 0; i < mhs.length; i++) {
            mhs[i] = new dataMhs();
            System.out.print("Masukkan data Mahasiswa ke-" + (i+1));
            System.out.println();
            System.out.print("Masukkan Nama: ");
            mhs[i].nama = sc.nextLine();
            System.out.print("Masukkan Nim: ");
            mhs[i].nim = sc.nextLine();
            System.out.print("Masukkan Jenis Kelamin: ");
            mhs[i].jenisKelamin = sc.next().charAt(0);
            System.out.print("Masukkan IPK: ");
            mhs[i].ipk = sc.nextDouble();

            sc.nextLine();
        }

        sc.close(); 

        tampilData();
        tampilIPKTerbesar();

        
    }

    static void tampilData() {
        for (int i = 0; i < mhs.length; i++) {
            System.out.println("Data Mahasiswa ke-" + (i+1));
            System.out.println("Nama: " + mhs[i].nama);
            System.out.println("Nim: " + mhs[i].nim);
            System.out.println("Jenis Kelamin: " + mhs[i].jenisKelamin);
            System.out.println("IPK: " + mhs[i].ipk);
        }

        System.out.println("Rata-Rata ipk adalah: " + hitungRataIPK());

    }

    static double hitungRataIPK() {
        double total = 0;
        for (int i = 0; i < mhs.length; i++) {
            total += mhs[i].ipk;
        }

        return total / mhs.length;
    }

    static void tampilIPKTerbesar() {
        double maxIPK = mhs[0].ipk;
        int index = 0;

        for (int i = 0; i < mhs.length; i++) {
            if (mhs[i].ipk > maxIPK) {
                maxIPK = mhs[i].ipk;
                index = i;
            }
        }

        System.out.println("Mahasiswa dcengan IPK terbesar: ");
        System.out.println("Nama: " + mhs[index].nama);
        System.out.println("Nim: " + mhs[index].nim);
        System.out.println("Jenis Kelamin: " + mhs[index].jenisKelamin);
        System.out.println("IPK: " + mhs[index].ipk);
    }
}