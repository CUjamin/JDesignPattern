package cuj.jdesignpattern.strategy.v1;

/**
 * @Author: cujamin
 * @ProjectName: JDesignPattern
 * @Date: 2019/5/14 9:25 PM
 * @Description: ${description}
 */
public class CashReturn implements CashSuper{

    private double moneyConfition;
    private double moneyReturn;

    public CashReturn(String myconfition,String myreturn) {
        moneyConfition = Double.parseDouble(myconfition);
        moneyReturn = Double.parseDouble(myreturn);
    }

    @Override
    public double acceptCash(double money) {
        double result = money;
        if(money>moneyConfition){
            result = money - money/moneyConfition*moneyReturn;
        }
        return result;
    }
}
