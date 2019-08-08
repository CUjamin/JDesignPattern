package cuj.jdesignpattern.adapter.nba;

/**
 * @Author: cujamin
 * @ProjectName: JDesignPattern
 * @Date: 2019/8/8 6:09 PM
 * @Description: ${description}
 */
public class Main {
    public static void main(String[] args) {
        Player b =  new Forwards("巴特尔");
        b.attack();
        Player a = new Guards("麦克格雷迪");
        a.attack();

        Player ym = new Translater("姚明");

        ym.attack();
        ym.defense();
    }
}
