package cuj.jdesignpattern.strategy.v0;

/**
 * @Author: cujamin
 * @ProjectName: JDesignPattern
 * @Date: 2019/5/14 9:08 PM
 * @Description: ${description}
 */
public class ConcreteStrategyA implements Strategy{
    @Override
    public void algorithm() {
        System.out.println("算法A");
    }
}
