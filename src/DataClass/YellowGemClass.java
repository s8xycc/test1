package DataClass;

public class YellowGemClass extends GemClass{



    public YellowGemClass(int leval,int attack,int health,int armor) {
        super(leval,attack,health,armor);
    }
    @Override
    public int getAttributes() {
        return this.getLevel() * this.getArmor();
    }
}
