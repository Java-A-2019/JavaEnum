package reflection;

import reflection.monster.Bat;
import reflection.monster.Boss;
import reflection.monster.Monster;
import reflection.monster.Slime;

public enum MonsterType {
    NULL(null), BAT(Bat.class), BOSS(Boss.class), SLIME(Slime.class);
    private final Class clz;
    MonsterType(Class clz) {
        this.clz = clz;
    }

    public Monster getInstance(){
        if (this.clz == null) return null;
        Monster monster = null;
        try {
            monster = (Monster) this.clz.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return monster;
    }
}
