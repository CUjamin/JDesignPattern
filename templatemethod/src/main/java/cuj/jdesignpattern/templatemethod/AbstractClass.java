package cuj.jdesignpattern.templatemethod;

/**
 * @Author: cujamin
 * @ProjectName: JDesignPattern
 * @Date: 2019/5/30 9:12 PM
 * @Description: ${description}
 */
public abstract class AbstractClass {

    public abstract void primitiveOperation1();
    public abstract void primitiveOperation2();


    public void templateMethod(){
        primitiveOperation1();
        primitiveOperation2();
        System.out.println("end");

    }

}
