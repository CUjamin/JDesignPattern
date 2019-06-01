package cuj.jdesignpattern.builder;

/**
 * @Author: cujamin
 * @ProjectName: JDesignPattern
 * @Date: 2019/6/1 3:07 PM
 * @Description: ${description}
 */
public class Director {
    public void construct(Builder builder){
        builder.buildPartA();
        builder.buildPartB();
    }
}
