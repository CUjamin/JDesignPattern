package cuj.jdesignpattern.builder;

/**
 * @Author: cujamin
 * @ProjectName: JDesignPattern
 * @Date: 2019/6/1 3:03 PM
 * @Description: ${description}
 */
public interface Builder {
    void buildPartA();
    void buildPartB();
    Product getResult();
}
