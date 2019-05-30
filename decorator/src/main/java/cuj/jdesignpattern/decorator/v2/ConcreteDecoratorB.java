package cuj.jdesignpattern.decorator.v2;

/**
 * @Author: cujamin
 * @ProjectName: JDesignPattern
 * @Date: 2019/5/20 10:38 PM
 * @Description: ${description}
 */
public class ConcreteDecoratorB extends Decorator{
    public  void operation(){
        super.operation();
        addedBehavior();
        System.out.println("具体装饰器对象B的操作");
    }

    private void addedBehavior() {
    }
}
