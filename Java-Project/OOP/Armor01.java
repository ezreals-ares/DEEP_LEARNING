package OOP;

public class Armor01 {
    String name;
    double defensepower;

    Armor01(String name, double defensepower) {
        this.name = name;
        this.defensepower = defensepower;
    }

    void display () {
        System.out.println("Armor: " + this.name + ", defense: " + this.defensepower);
    }

    
}