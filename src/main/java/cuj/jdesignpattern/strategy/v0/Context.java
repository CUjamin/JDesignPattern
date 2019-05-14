package cuj.jdesignpattern.strategy.v0;

/**
 * @Author: cujamin
 * @ProjectName: JDesignPattern
 * @Date: 2019/5/14 9:12 PM
 * @Description: ${description}
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    public void contextAlgorithm(){
        strategy.algorithm();
    }
}
