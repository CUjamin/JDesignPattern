package cuj.jdesignpattern.decorator.v3;

/**
 * @Author: cujamin
 * @ProjectName: JDesignPattern
 * @Date: 2019/5/20 10:53 PM
 * @Description: ${description}
 */
public class Main {
    public static void main(String[] args) {
        Person person  = new Person("小菜");
        System.out.println("第一种打扮");
        BigTrouser bigTrouser = new BigTrouser();
        TShirts tShirts = new TShirts();

        tShirts.decorate(person);
        bigTrouser.decorate(tShirts);
        bigTrouser.show();
    }
}
