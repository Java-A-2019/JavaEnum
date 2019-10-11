package reflection;

import reflection.monster.Monster;

public class TestMonster {
    public static void main(String[] args) {
        MonsterType[] types = MonsterType.values();
        for (int i = 0 ; i < types.length; i++) {
            Monster monster = types[i].getInstance();
            if (monster != null) monster.attack();
        }
    }
}
