package OOP;

import java.util.Scanner;

public class mainshape {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        kerucut[] kerucuts = new kerucut[2];
        limas[] limass = new limas[2];
        bola[] bolas = new bola[2];

        for (int i = 0; i < kerucuts.length; i++) {
            kerucuts[i] = new kerucut();
            System.out.print("Masukkan jari2 kerucut ke-" + (i+1) + ": ");
            kerucuts[i].jariJari = sc.nextDouble();
            System.out.print("Masukkan sisi miring ke-" + (i+1) + ": ");
            kerucuts[i].sisiMiring = sc.nextDouble();
            System.out.print("Masukkan tinggi kerucut ke-" + (i+1) + ": ");
            kerucuts[i].tinggi = sc.nextDouble();
        }
        for (int i = 0; i < limass.length; i++) {
            limass[i] = new limas();
            System.out.print("Masukkan panjang sisi alas limas ke-" + (i+1) + ": ");
            limass[i].panjangSisisAlas = sc.nextDouble();
            System.out.print("Masukkan tinggi limas ke-" + (i+1) + ": ");
            limass[i].tinggi = sc.nextDouble();
        }
        for (int i = 0; i < kerucuts.length; i++) {
            bolas[i] = new bola();
            System.out.print("Masukkan jari2 bola ke-" + (i+1) + ": ");
            bolas[i].jariJari = sc.nextDouble();

        }

        sc.close();

        System.out.println();

        for (int i = 0; i < kerucuts.length; i++) {
            System.out.println("Volume kerucut ke-" + (i+1) + " adalah: " + kerucuts[i].hitungVolume());
            System.out.println("Luas permukaan kerucut ke-" + (i+1) + " adalah: " + kerucuts[i].hitungluasPermukaan());
        }
        for (int i = 0; i < limass.length; i++) {
            System.out.println("Volume limas ke-" + (i+1) + " adalah: " + limass[i].hitungVolume());
            System.out.println("Luas permukaan limas ke-" + (i+1) + " adalah: " + limass[i].hitungluasPermukaan());
        }
        for (int i = 0; i < bolas.length; i++) {
            System.out.println("Volume bola ke-" + (i+1) + "adalah: " + bolas[i].hitungVolume());
            System.out.println("Luas permukaan bola ke-" + (i+1) + " adalah: " + bolas[i].hitungluasPermukaan());
        }


    }

    
}