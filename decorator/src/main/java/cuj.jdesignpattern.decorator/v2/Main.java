package cuj.jdesignpattern.decorator.v2;

import cuj.jdesignpattern.decorator.v2.ConcreteComponent;
import cuj.jdesignpattern.decorator.v2.ConcreteDecoratorA;
import cuj.jdesignpattern.decorator.v2.ConcreteDecoratorB;

/**
 * @Author: cujamin
 * @ProjectName: JDesignPattern
 * @Date: 2019/5/20 10:40 PM
 * @Description: ${description}
 */
public class Main {
    public static void main(String[] args) {
        ConcreteComponent c = new ConcreteComponent();
        ConcreteDecoratorA a = new ConcreteDecoratorA();
        ConcreteDecoratorB b = new ConcreteDecoratorB();
        a.setComponent(c);
        b.setComponent(a);
        b.operation();
    }
}
