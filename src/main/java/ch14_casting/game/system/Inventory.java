package ch14_casting.game.system;

import ch14_casting.game.items.*;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Inventory {
    private Weapon[] weaponSlot;
    public Inventory(int capacity) {
        this.weaponSlot = new Weapon[capacity];
    }

    public void addWeapon(Weapon weapon) {
        for(int i = 0; i < weaponSlot.length; i++) {
            if(weaponSlot[i] == null) {
                weaponSlot[i] = weapon;
                System.out.println("아이템이 슬롯 [ " + (i+1) + " ] 에 추가되었습니다.");
                return;
            }
        }
        System.out.println("인벤토리가 가득차서 무기를 더 이상 주울 수 없습니다.");
    }

    public void attackAll() {
        for(Weapon weapon : weaponSlot) {
            if(weapon != null) {
                weapon.attack();
                continue;
            }
            System.out.println("무기를 장착하고 있지 않습니다");
        }
    }

    public void useSpecialAbilities() {
        System.out.println("다운캐스팅을 응용한 각 객체의 고유 method 호출");
        for (Weapon weapon : weaponSlot) {
            if (weapon == null) {
                System.out.println("무기를 장착하고 있지 않아 스킬을 쓸 수 없습니다.");
                continue;
            }
            if (weapon instanceof Sword) {
                Sword sword = (Sword) weapon;
                sword.parry();
            } else if (weapon instanceof Bow) {
                Bow bow = (Bow) weapon;
                bow.snipe();
            } else if (weapon instanceof Staff) {
                Staff staff = (Staff) weapon;
                staff.castSpell();
            } else {
                System.out.println("알 수 없는 무기입니다.");
            }
        }
    }
}



