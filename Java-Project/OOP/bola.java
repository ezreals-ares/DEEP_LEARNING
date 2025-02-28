package OOP;

public class bola {

    double jariJari;
    double pi = 3.14;

    double hitungluasPermukaan () {
        return 4 * pi * (jariJari * jariJari);
    }

    double hitungVolume () {
        return (4.0 / 3) * pi * (this.jariJari * this.jariJari * this.jariJari);
    }
}