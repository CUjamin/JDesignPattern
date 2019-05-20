package cuj.jdesignpattern.decorator.v2;

/**
 * @Author: cujamin
 * @ProjectName: JDesignPattern
 * @Date: 2019/5/20 10:31 PM
 * @Description: ${description}
 */
public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("具体对象的操作");
    }
}
