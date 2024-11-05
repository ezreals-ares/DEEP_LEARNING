import java.util.Scanner;

public class SuhuKota {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] kota = {"Tokyo", "Osaka", "Sapporo", "Fukouka", "Naha"};
        int hari = 7;

        double [][] suhu = new double[5][hari];

        for (int i = 0; i < kota.length; i++) {
            System.out.print("Masukkan data suhu untuk kota " + kota[i] + ": ");
            System.out.println();

            for (int j = 0; j < hari; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                suhu[i][j] = sc.nextDouble();
            }
            System.out.println();
        }
        sc.close();

        System.out.println("\nData suhu yang dimasukkan");
        for (int i = 0; i < kota.length; i++) {
            System.out.print(kota[i] + ": ");
            for (int j = 0; j < hari; j++) {
                System.out.print(suhu[i][j] + "C");
                
            }
            System.out.println();
            
        }
    }
}