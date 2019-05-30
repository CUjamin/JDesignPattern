package cuj.jdesignpattern.factory.v1;

import cuj.jdesignpattern.simplefactory.Operation;

/**
 * @Author: cujamin
 * @ProjectName: JDesignPattern
 * @Date: 2019/5/22 8:37 PM
 * @Description: ${description}
 */
public class Main {
    public static void main(String[] args) throws Exception{
        IFactory operFactory = new AddFactory();
        Operation oper = operFactory.createOperation();
        oper.setNumberA(1);
        oper.setNumberB(2);
        System.out.println(oper.getResult());
    }
}
