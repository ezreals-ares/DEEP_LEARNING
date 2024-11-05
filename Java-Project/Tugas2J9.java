import java.util.Scanner;

public class Tugas2J9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Memasukkan input user berupa integer ke variabel jmlhPesanan
        System.out.print("Masukkan jumlah pesanan : ");
        int jmlhPesanan = sc.nextInt();
        sc.nextLine();

        // Membuat Array dengan length variabel jmllPesanan
        String[] namaMakanan = new String[jmlhPesanan];
        double[] hargaMakanan = new double[jmlhPesanan];
        
        double totalHarga = 0;

        // Perulangan untuk memasukkan dan menyimpan input dalam Array
        for (int i = 0; i < jmlhPesanan; i++) {
            System.out.print("Masukkan Nama Makanan : ");
            namaMakanan[i] = sc.nextLine();
            
            System.out.print("Masukkan Harga Makanan : ");
            hargaMakanan[i] = sc.nextInt();
            sc.nextLine();

            totalHarga += hargaMakanan[i];
        }
        
        // Menampilkan daftar makanan
        System.out.println("\nDaftar Makanan dan Harga");
        
        for (int i = 0; i < jmlhPesanan; i++) {

            System.out.println((i + 1) + ". " + namaMakanan[i] + " Dengan Harga " + hargaMakanan[i]);  
        }
        System.out.println("\nDengan total harga Rp. " + totalHarga);
        sc.close();
    }
}