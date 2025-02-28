package OOP;
public class Player {

    String name;
    double health;
    int level;

    Armor armor;
    Weapon weapon;

    Player (String name, double health, int level) {
        this.name = name;
        this.health = health;
        this.level = level;
    }

    void equipWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    void equipArmor(Armor armor) {
        this.armor = armor;
    }

    void display() {
        System.out.println("Nama: " + this.name + " Health: " + this.health + " hp " + " Level: " + this.level);
        armor.display();
        weapon.display();
    }
}