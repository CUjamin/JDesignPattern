package cuj.jdesignpattern.proxy.v1;

/**
 * @Author: cujamin
 * @ProjectName: JDesignPattern
 * @Date: 2019/5/21 9:38 PM
 * @Description: ${description}
 */
public class Main {
    public static void main(String[] args) {
        SchoolGirl jiaojiao = new SchoolGirl();
        jiaojiao.setName("娇娇");
        Pursuit zhuojiayi = new Pursuit(jiaojiao);
        zhuojiayi.giveDolls();
        zhuojiayi.giveFlowers();
        zhuojiayi.giveChocolate();
    }
}
