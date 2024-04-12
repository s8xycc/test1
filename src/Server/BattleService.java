package Server;
/*
    工具类
    负责人：
    功能：各种逻辑判断的工具
    参数：void
    返回值：void
*/

import DataClass.PlayerClass;

public class BattleService {

    /*
        战斗胜负判断
        负责人：江
        功能：根据回合，对玩家和人机的属性进行增减，最后返回布尔值，表示玩家获胜或失败
        参数：PlayerClass player1, PlayerClass player2
        返回值：Boolean
    */
    public Boolean Battle(PlayerClass player1, PlayerClass player2){
        //填写代码
        return true;
    }

    /*
        胜利次数与失败次数判断
        负责人：江
        功能：根据人物类的winnum和losenum判断是否通关游戏
        参数：
        返回值：Boolean
    */
    public Boolean isWin(PlayerClass player){
        //填写代码
        return true;
    }
    /*
        修改胜利与失败次数
        负责人：启动
        功能：根据Battle方法的返回值修改winnum和losenum
        参数：void
        返回值：void
    */
    void modifyNum(){
        //填写代码
    }


}
