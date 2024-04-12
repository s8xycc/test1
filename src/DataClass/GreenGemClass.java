package DataClass;

public class GreenGemClass extends GemClass {


    public GreenGemClass(int leval,int attack,int health,int armor) {
        super(leval,attack,health,armor);
    }

    @Override
    public int getAttributes() {
        return this.getLevel() * this.getHealth();
    }
}
