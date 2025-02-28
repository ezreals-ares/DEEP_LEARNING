package OOP;
public class persegiPanjang {

    int panjang;
    int lebar;

    persegiPanjang(int p, int l) {
        panjang = p;
        lebar = l;

    }

    int hitungLuas() {
        return panjang * lebar;
    }

    int hitungKeliling() {
        return 2 * (panjang + lebar);
    }

    
}