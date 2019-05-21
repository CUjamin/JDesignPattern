package cuj.jdesignpattern.proxy.v1;

/**
 * @Author: cujamin
 * @ProjectName: JDesignPattern
 * @Date: 2019/5/21 9:34 PM
 * @Description: ${description}
 */
public class Pursuit {
    SchoolGirl mm;

    public Pursuit(SchoolGirl mm) {
        this.mm = mm;
    }
    public void giveDolls(){
        System.out.println(mm.getName()+" - 送你洋娃娃");
    }
    public void giveFlowers(){
        System.out.println(mm.getName()+" - 送你鲜花");
    }
    public void giveChocolate(){
        System.out.println(mm.getName()+" - 送你巧克力");
    }
}
