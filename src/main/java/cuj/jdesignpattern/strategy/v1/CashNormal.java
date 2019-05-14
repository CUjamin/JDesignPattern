package cuj.jdesignpattern.strategy.v1;

/**
 * @Author: cujamin
 * @ProjectName: JDesignPattern
 * @Date: 2019/5/14 9:24 PM
 * @Description: ${description}
 */
public class CashNormal implements CashSuper{
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
