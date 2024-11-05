import java.util.Scanner;

public class LatihanArray4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        double rata2;

        int[] angka = new int[10];

        for (int i = 0; i < angka.length; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = sc.nextInt();

            total += angka[i];
        }

        rata2 = total/angka.length;

        System.out.println("Rata ratanya adalah " + rata2);
        sc.close();

    
    }
    
}
