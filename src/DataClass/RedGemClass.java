package DataClass;

public class RedGemClass extends GemClass{

    public RedGemClass(int leval,int attack,int health,int armor) {
        super(leval,attack,health,armor);
    }



    @Override
    public int getAttributes() {
        return this.getLevel() * this.getAttack();
    }




}
