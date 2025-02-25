package DEEP_LEARNING.OOP;

public class limas {

    double panjangSisisAlas;
    double tinggi;
    double pi = 3.14;

    double hitungVolume() {
        return (1.0 / 3) * (panjangSisisAlas * panjangSisisAlas) * tinggi;
    }

    double hitungluasPermukaan() {
        return (panjangSisisAlas * panjangSisisAlas) + 2 * panjangSisisAlas * tinggi;
    }
}