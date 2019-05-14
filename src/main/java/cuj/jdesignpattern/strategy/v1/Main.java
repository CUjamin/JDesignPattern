package cuj.jdesignpattern.strategy.v1;

/**
 * @Author: cujamin
 * @ProjectName: JDesignPattern
 * @Date: 2019/5/14 9:26 PM
 * @Description: ${description}
 */
public class Main {
    public static void main(String[] args) {
        CashContext cashContext = new CashContext("正常");
        System.out.println(cashContext.getResult(301));
        cashContext = new CashContext("满返");
        System.out.println(cashContext.getResult(301));
        cashContext = new CashContext("打折");
        System.out.println(cashContext.getResult(301));
    }
}
