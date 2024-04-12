package DataClass;

public class GemClass {
    //等级
    public int level;
    //攻击力
    public int attack;
    //生命值
    public int health;
    //护甲
    public int armor;


    //获取宝石提升的属性
    public int getAttributes() {
        return 0;
    }

    ;

    public GemClass() {
    }

    public GemClass(int level, int attack, int health, int armor) {
        this.level = level;
        this.attack = attack;
        this.health = health;
        this.armor = armor;
    }


    /**
     * 获取
     *
     * @return level
     */
    public int getLevel() {
        return level;
    }

    /**
     * 设置
     *
     * @param level
     */
    public void setLevel(int level) {
        this.level = level;
    }

    /**
     * 获取
     *
     * @return attack
     */
    public int getAttack() {
        return attack;
    }

    /**
     * 设置
     *
     * @param attack
     */
    public void setAttack(int attack) {
        this.attack = attack;
    }

    /**
     * 获取
     *
     * @return health
     */
    public int getHealth() {
        return health;
    }

    /**
     * 设置
     *
     * @param health
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * 获取
     *
     * @return armor
     */
    public int getArmor() {
        return armor;
    }

    /**
     * 设置
     *
     * @param armor
     */
    public void setArmor(int armor) {
        this.armor = armor;
    }

    public String toString() {
        return "GemClass{level = " + level + ", attack = " + attack + ", health = " + health + ", armor = " + armor + "}";
    }


}
