import java.util.Scanner;

public class Tugas1J9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        double rata2;

        System.out.print("Masukkan banyaknya nilai mahasiswa : ");
        int jmlhNilai = sc.nextInt();

        int[] nilaimhs = new int[jmlhNilai];

        for (int i = 0; i < nilaimhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaimhs[i] = sc.nextInt();
        }

       int terendah = nilaimhs[0];
       int tertinggi = nilaimhs[0];

       for (int i = 0; i < nilaimhs.length; i++) {
            total += nilaimhs[i];

            if(nilaimhs[i] > tertinggi) {
                tertinggi = nilaimhs[i];
            }

            if (nilaimhs[i] < terendah) {
                terendah = nilaimhs[i];
            }
       }

       rata2 = total/nilaimhs.length;

       System.out.println("Daftar Nilai Mahasiswa : ");
       for (int i : nilaimhs) {
            System.out.print(i + " ");
       }

       System.out.println("\nNilai tertinggi : " + tertinggi);
       System.out.println("Nilai terendah : " + terendah);
       System.out.println("Dengan rata-rata nilai : " + rata2);

       sc.close();
    }
    
}
