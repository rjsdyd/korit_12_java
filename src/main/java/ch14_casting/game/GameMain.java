package ch14_casting.game;

import ch14_casting.game.items.*;
import ch14_casting.game.system.Inventory;

public class GameMain {
    public static void main(String[] args) {
        Inventory inventory1 = new Inventory(new Weapon[5]);
        Inventory myInventory = new Inventory(5);

        myInventory.addWeapon(new Sword());
        myInventory.addWeapon(new Bow());
        myInventory.addWeapon(new Staff());

        myInventory.attackAll();
        System.out.println();
        myInventory.useSpecialAbilities();
    }
}
