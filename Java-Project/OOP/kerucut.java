package OOP;

public class kerucut {

    double jariJari;
    double sisiMiring;
    double tinggi;
    double pi = 3.14;

    double hitungluasPermukaan() {
        return pi * this.jariJari * (this.jariJari + this.sisiMiring);
    }

    double hitungVolume() {
        return (1.0 / 3) * pi * (this.jariJari * this.jariJari) * this.tinggi;
    }


}