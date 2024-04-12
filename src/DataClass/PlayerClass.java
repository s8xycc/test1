package DataClass;

//人物类
public class PlayerClass {
    //人物id，唯一，后续可作为人机难度识别
    private String id;
    //人物名字
    private String name;
    //人物攻击力
    private int attack;
    //生命值
    private int health;
    //护甲值
    private int armer;
    //背包空间(-1代表为未开辟空间的背包格，0代表为已开辟空间但是未放置空间的单元格，其余数据代表代表该单元格已被宝石占据)
    private Object[][] back;
    //金币数
    private int money;
    //胜利回合数
    private int winnum;
    //失败回合数
    private int losenum;

    public PlayerClass() {
    }

    public PlayerClass(String id, String name, int attack, int health, int armer, Object[][] back, int money, int winnum, int losenum) {
        this.id = id;
        this.name = name;
        this.attack = attack;
        this.health = health;
        this.armer = armer;
        this.back = back;
        this.money = money;
        this.winnum = winnum;
        this.losenum = losenum;
    }

    public void init_Player() {
        this.attack = 5;
        this.health = 50;
        this.armer = 0;
        this.back = new Object[][]{{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}, {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}, {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}, {-1, -1, -1, -1, -1, 0, 0, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, 0, 0, -1, -1, -1, -1, -1}, {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}, {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}, {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}};
        this.money = 10;
        this.winnum = 0;
        this.losenum = 0;
    }


    /**
     * 获取
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return attack
     */
    public int getAttack() {
        return attack;
    }

    /**
     * 设置
     * @param attack
     */
    public void setAttack(int attack) {
        this.attack = attack;
    }

    /**
     * 获取
     * @return health
     */
    public int getHealth() {
        return health;
    }

    /**
     * 设置
     * @param health
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * 获取
     * @return armer
     */
    public int getArmer() {
        return armer;
    }

    /**
     * 设置
     * @param armer
     */
    public void setArmer(int armer) {
        this.armer = armer;
    }

    /**
     * 获取
     * @return back
     */
    public Object[][] getBack() {
        return back;
    }

    /**
     * 设置
     * @param back
     */
    public void setBack(Object[][] back) {
        this.back = back;
    }

    /**
     * 获取
     * @return money
     */
    public int getMoney() {
        return money;
    }

    /**
     * 设置
     * @param money
     */
    public void setMoney(int money) {
        this.money = money;
    }

    /**
     * 获取
     * @return winnum
     */
    public int getWinnum() {
        return winnum;
    }

    /**
     * 设置
     * @param winnum
     */
    public void setWinnum(int winnum) {
        this.winnum = winnum;
    }

    /**
     * 获取
     * @return losenum
     */
    public int getLosenum() {
        return losenum;
    }

    /**
     * 设置
     * @param losenum
     */
    public void setLosenum(int losenum) {
        this.losenum = losenum;
    }

    public String toString() {
        return "PlayerClass{id = " + id + ", name = " + name + ", attack = " + attack + ", health = " + health + ", armer = " + armer + ", back = " + back + ", money = " + money + ", winnum = " + winnum + ", losenum = " + losenum + "}";
    }
}
