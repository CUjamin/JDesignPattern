package cuj.jdesignpattern.adapter.nba;

/**
 * @Author: cujamin
 * @ProjectName: JDesignPattern
 * @Date: 2019/8/8 6:07 PM
 * @Description: ${description}
 */
public class Center extends Player{

    public Center(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("中锋 "+name+" 进攻");
    }

    @Override
    public void defense() {
        System.out.println("中锋 "+name+" 防守");
    }
}
