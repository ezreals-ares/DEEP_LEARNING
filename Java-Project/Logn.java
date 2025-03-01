import java.util.Scanner;

public class Logn {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int buku, lembar;

        System.out.print("Masukkan jumlah buku: ");
        buku = sc.nextInt();

        System.out.print("Masukkan jumlah lembar: ");
        lembar = sc.nextInt();

        for (int i = 0; i < buku; i++) {
            for (int j = 0; j < lembar; j++) {
                System.out.println("jumlah buku " + i + "jumlah lembar " + j);
            }
            
        }

        sc.close();

    }
}

