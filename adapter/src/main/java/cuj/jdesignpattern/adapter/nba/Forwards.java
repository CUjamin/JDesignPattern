package cuj.jdesignpattern.adapter.nba;

/**
 * @Author: cujamin
 * @ProjectName: JDesignPattern
 * @Date: 2019/8/8 6:05 PM
 * @Description: ${description}
 */
public class Forwards extends Player{

    public Forwards(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("前锋 "+name+" 进攻");
    }

    @Override
    public void defense() {
        System.out.println("前锋 "+name+" 防守");
    }
}
