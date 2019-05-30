package cuj.jdesignpattern.strategy.v0;

/**
 * @Author: cujamin
 * @ProjectName: JDesignPattern
 * @Date: 2019/5/14 9:14 PM
 * @Description: ${description}
 */
public class Main {
    public static void main(String[] args) {
        Context context;
        context = new Context(new ConcreteStrategyA());
        context.contextAlgorithm();

        context = new Context(new ConcreteStrategyB());
        context.contextAlgorithm();

        context = new Context(new ConcreteStrategyC());
        context.contextAlgorithm();
    }
}
