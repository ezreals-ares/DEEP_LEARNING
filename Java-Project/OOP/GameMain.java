package OOP;

public class GameMain {

    public static void main(String[] args) {

        Player player1 = new Player("Ucup", 1500, 5);

        Weapon sword = new Weapon("Sword", 150);

        Armor iron_chesptlate = new Armor("Iron Chestplate", 40);

        player1.equipWeapon(sword);
        player1.equipArmor(iron_chesptlate);
        player1.display();


    }
}