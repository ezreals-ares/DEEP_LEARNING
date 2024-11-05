import java.util.Scanner;

public class LatihanArray1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] angka = new int[30];

        for (int i = 0; i < angka.length; i++) {
            System.out.print("Masukkan 30 Angka : ");
            angka[i] = sc.nextInt();
        }

        // for each menampilkan isi Array angka dengan variabel i
        for (int i : angka) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}