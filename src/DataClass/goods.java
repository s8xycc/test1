package DataClass;


//商店类

public class goods {
    int price;

    Object goods;
    //背包
    public goods() {
        this.goods = 0;
        this.price = 2;
    }
    //一级绿宝石
    public goods(GreenGemClass GreenGem) {
        this.goods = GreenGem;
        this.price = 2;
    }
    //一级红宝石
    public goods(RedGemClass RedGem) {
        this.goods = RedGem;
        this.price = 2;
    }
    //一级黄宝石
    public goods(YellowGemClass YellowGem){
        this.goods = YellowGem;
        this.price = 2;
    }
    //显示价格
    public int getPrice() {
        return price;
    }
}
