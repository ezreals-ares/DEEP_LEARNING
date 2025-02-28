package OOP;
public class Weapon {

    String name;
    double attkpower;

    Weapon(String name, double attkpower) {
        this.name = name;
        this.attkpower = attkpower;

    }

    void display () {
        System.out.println("Weapon: " + this.name + " AttackPower: " + this.attkpower);
    }
}