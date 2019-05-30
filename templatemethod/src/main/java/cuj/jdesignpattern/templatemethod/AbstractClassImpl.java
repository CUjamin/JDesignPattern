package cuj.jdesignpattern.templatemethod;

/**
 * @Author: cujamin
 * @ProjectName: JDesignPattern
 * @Date: 2019/5/30 9:14 PM
 * @Description: ${description}
 */
public class AbstractClassImpl extends AbstractClass {
    @Override
    public void primitiveOperation1() {
        System.out.println("具体方法实现1");
    }

    @Override
    public void primitiveOperation2() {
        System.out.println("具体方法实现2");

    }
}
