package OOP;
public class GameMain01 {
    
    public static void main(String[] args) {

        // Pembuatan Object
        Player01 player1 = new Player01("Sugiono", 100);
        Weapon01 sword = new Weapon01("Sword", 120);    
        Armor01 diamond = new Armor01("Diamond", 300);
    
        player1.equipWeapon(sword);
        player1.equipArmor(diamond);
        player1.display();

    }
   
}