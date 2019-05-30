package cuj.jdesignpattern.proxy.v2;

import cuj.jdesignpattern.proxy.v1.SchoolGirl;

/**
 * @Author: cujamin
 * @ProjectName: JDesignPattern
 * @Date: 2019/5/21 9:45 PM
 * @Description: ${description}
 */
public class Proxy implements IGiveGift {
    private Pursuit gg;

    public Proxy(SchoolGirl mm) {
        this.gg = new Pursuit(mm);
    }

    @Override
    public void giveDolls() {
        gg.giveDolls();

    }

    @Override
    public void giveFlowers() {
        gg.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        gg.giveChocolate();
    }
}
