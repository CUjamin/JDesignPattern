package cuj.jdesignpattern.pubsub.v0;

import cuj.jdesignpattern.pubsub.v0.Secretary;
import cuj.jdesignpattern.pubsub.v0.StockObserver;

/**
 * @Author: cujamin
 * @ProjectName: JDesignPattern
 * @Date: 2019/6/1 4:56 PM
 * @Description: ${description}
 */
public class Main {
    public static void main(String[] args) {
        Secretary tongzizhe = new Secretary();

        StockObserver tongshi1 = new StockObserver("魏关姹",tongzizhe);
        StockObserver tongshi2 = new StockObserver("易管查",tongzizhe);

        tongzizhe.attach(tongshi1);
        tongzizhe.attach(tongshi2);

        tongzizhe.secretaryAction("老板来了");

        tongzizhe.notify2();

    }
}
