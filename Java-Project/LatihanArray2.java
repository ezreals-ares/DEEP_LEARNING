import java.util.Scanner;

public class LatihanArray2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] angka = new int[10];

        for (int i = 0; i < angka.length; i++) {
            System.out.print("Masukkan 10 angka : ");
            angka[i] = sc.nextInt();
        }
        
        // For loop dari terbesar ke terkecil (index 9-0)
        for (int i = angka.length - 1; i >= 0; i--) {
            System.out.print(angka[i] + " ");
        }
        sc.close();
    }
}
