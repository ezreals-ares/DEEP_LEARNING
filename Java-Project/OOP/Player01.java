package OOP;
public class Player01 {

    String name;
    double health;

    Weapon01 weapon;
    Armor01 armor;

    Player01(String name, double health) {
         this.name = name;
         this.health = health;
    }

    void equipWeapon(Weapon01 weapon) {
        this.weapon = weapon;
    }

    void equipArmor (Armor01 armor) {
        this.armor = armor;
    }

    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Health: " + this.health + " hp");
        weapon.display();
        armor.display();
    }

    
}