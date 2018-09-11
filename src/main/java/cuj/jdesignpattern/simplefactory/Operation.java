package cuj.jdesignpattern.simplefactory;

/**
 * Created by cujamin on 2018/9/11.
 */
public class Operation {
    public static double getResult(double numberA,double numberB,String operate) {
        double result=0D;
        switch (operate)
        {
            case "+":result=numberA+numberB;
                break;
            case "-":result=numberA-numberB;
                break;
            case "*":result=numberA*numberB;
                break;
            case "/":result=numberA/numberB;
                break;
            default:break;
        }
        return result;
    }
}
