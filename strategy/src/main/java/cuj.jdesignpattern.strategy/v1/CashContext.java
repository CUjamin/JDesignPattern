package cuj.jdesignpattern.strategy.v1;

/**
 * @Author: cujamin
 * @ProjectName: JDesignPattern
 * @Date: 2019/5/14 9:17 PM
 * @Description: ${description}
 */
public class CashContext {
    private CashSuper cashSuper;


    public CashContext(String type) {
        switch (type){
            case "正常":
                this.cashSuper = new CashNormal();
                break;
            case "满返":
                this.cashSuper = new CashReturn("300","100");
                break;
            case "打折":
                this.cashSuper = new CashRebate("0.8");
                break;
        }
    }

    public double getResult(double money){
        return cashSuper.acceptCash(money);
    }
}
