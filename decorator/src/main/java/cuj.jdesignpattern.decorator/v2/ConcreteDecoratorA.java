package cuj.jdesignpattern.decorator.v2;

/**
 * @Author: cujamin
 * @ProjectName: JDesignPattern
 * @Date: 2019/5/20 10:35 PM
 * @Description: ${description}
 */
public class ConcreteDecoratorA extends Decorator {
    private String addedState;
    public void operation(){
        super.operation();
        addedState = "New State";
        System.out.println("具体装饰对象A的操作");

    }
}
