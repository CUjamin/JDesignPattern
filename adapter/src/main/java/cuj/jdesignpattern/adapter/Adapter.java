package cuj.jdesignpattern.adapter;

/**
 * @Author: cujamin
 * @ProjectName: JDesignPattern
 * @Date: 2019/8/8 5:57 PM
 * @Description: ${description}
 */
public class Adapter extends Target{

    private Adaptee adaptee = new Adaptee();

    public void request(){
        adaptee.specificRequest();
    }

}
