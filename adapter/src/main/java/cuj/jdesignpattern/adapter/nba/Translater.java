package cuj.jdesignpattern.adapter.nba;

/**
 * @Author: cujamin
 * @ProjectName: JDesignPattern
 * @Date: 2019/8/8 6:13 PM
 * @Description: ${description}
 */
public class Translater extends Player{

    private ForeginCenter wjzf = new ForeginCenter();

    public Translater(String name) {
        super(name);
        wjzf.setName(name);
    }

    @Override
    public void attack() {
        wjzf.attack();
    }

    @Override
    public void defense() {
        wjzf.defense();
    }
}
