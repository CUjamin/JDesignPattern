package cuj.jdesignpattern.prototype;

/**
 * @Author: cujamin
 * @ProjectName: JDesignPattern
 * @Date: 2019/5/30 9:06 PM
 * @Description: ${description}
 */
public class Main {
    public static void main(String[] args) {
        ConcretePrototypeImpl p1 = new ConcretePrototypeImpl("I");
        try {
            ConcretePrototypeImpl c1 = (ConcretePrototypeImpl) p1.clone();
            System.out.println("Clone:"+c1.getId());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
