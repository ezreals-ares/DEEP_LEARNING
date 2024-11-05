import java.util.Scanner;

public class LatihanArray5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] Bilangan = {54, 65, 43, 54, 65, 32, 54, 65, 32, 76};

        System.out.print("Masukkan key : ");
        int key = sc.nextInt();

        boolean ditemukan = false;

        for (int i = 0; i < Bilangan.length; i++) {
            if (key == Bilangan[i]) {
              System.out.println("Bilangan " + key + " ditemukan di index ke-" + i);
              ditemukan = true;
            } 
        }

        if (!ditemukan) {
            System.out.println("Bilangan " + key + " tidak ditemukan");

        }
        sc.close();
        
    }
}
