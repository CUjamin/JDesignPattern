package cuj.jdesignpattern.builder;

/**
 * @Author: cujamin
 * @ProjectName: JDesignPattern
 * @Date: 2019/6/1 3:04 PM
 * @Description: ${description}
 */
public class ConcreteBuilder1 implements Builder {
    Product product = new Product();

    @Override
    public void buildPartA() {
        product.add("部件A");

    }

    @Override
    public void buildPartB() {
        product.add("部件B");

    }

    @Override
    public Product getResult() {
        return product;
    }
}
