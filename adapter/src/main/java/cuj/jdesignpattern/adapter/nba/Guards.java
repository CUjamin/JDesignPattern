package cuj.jdesignpattern.adapter.nba;

/**
 * @Author: cujamin
 * @ProjectName: JDesignPattern
 * @Date: 2019/8/8 6:08 PM
 * @Description: ${description}
 */
public class Guards extends Player{

    public Guards(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("后卫 "+name+" 进攻");
    }

    @Override
    public void defense() {
        System.out.println("后卫 "+name+" 防守");
    }
}
