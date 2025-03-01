package OOP;

public class Armor {

    String name;
    double defensepower;

    Armor(String name, double defensepower) {
        this.name = name;
        this.defensepower = defensepower;

    }

    void display () {
        System.out.println("Armor: " + this.name + " DefensePower: " + this.defensepower);
    }
}