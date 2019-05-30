package cuj.jdesignpattern.strategy.v1;

/**
 * @Author: cujamin
 * @ProjectName: JDesignPattern
 * @Date: 2019/5/14 9:19 PM
 * @Description: ${description}
 */
public class CashRebate implements CashSuper {
    private double moneyRebate = 1D;

    public CashRebate(String myRebate) {
        moneyRebate = Double.parseDouble(myRebate);
    }

    @Override
    public double acceptCash(double money) {
        return money*moneyRebate;
    }
}
