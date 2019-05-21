package cuj.jdesignpattern.proxy.v2;

import cuj.jdesignpattern.proxy.v1.SchoolGirl;

/**
 * @Author: cujamin
 * @ProjectName: JDesignPattern
 * @Date: 2019/5/21 9:43 PM
 * @Description: ${description}
 */
public class Pursuit implements IGiveGift {

    private SchoolGirl mm;

    public Pursuit(SchoolGirl mm) {
        this.mm = mm;
    }

    @Override
    public void giveDolls() {
        System.out.println(mm.getName()+" - 送你洋娃娃");
    }

    @Override
    public void giveFlowers() {
        System.out.println(mm.getName()+" - 送你鲜花");
    }

    @Override
    public void giveChocolate() {
        System.out.println(mm.getName()+" - 送你巧克力");
    }
}
