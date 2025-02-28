package OOP;

import java.util.Scanner;

public class persegiPanjangMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        persegiPanjang[] ppArray = new persegiPanjang[3];

        ppArray[0] = new persegiPanjang(14, 4);
        ppArray[1] = new persegiPanjang(7, 2);
        ppArray[2] = new persegiPanjang(12, 3);
        

        System.out.println();

        for (int i = 0; i < ppArray.length; i++) {
            System.out.println("Panjang Persegi Panjang ke-" + i + " adalah " + ppArray[i].panjang);
            System.out.println("Lebar Persegi Panjang ke-" + i + " adalah " + ppArray[i].lebar);
            System.out.println("Keliling persegi panjang ke-" + i + " adalah " + ppArray[i].hitungKeliling());
            System.out.println("Luas persegi panjang ke-" + i + " adalah " + ppArray[i].hitungLuas());
        }

        sc.close();

       


    }
}