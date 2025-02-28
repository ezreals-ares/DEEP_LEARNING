package OOP;
public class Weapon01 {

    String name;
    double attackpower;

    Weapon01(String name, double attackpower) {
        this.name = name;
        this.attackpower = attackpower;
    }

    void display() {
        System.out.println("Weapon: " + this.name + ", attack: " + this.attackpower);
    }
}