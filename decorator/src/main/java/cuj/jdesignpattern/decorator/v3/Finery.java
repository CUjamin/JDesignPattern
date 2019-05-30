package cuj.jdesignpattern.decorator.v3;

/**
 * @Author: cujamin
 * @ProjectName: JDesignPattern
 * @Date: 2019/5/20 10:46 PM
 * @Description: ${description}
 */
public class Finery extends Person{
    protected Person component;

    public void decorate(Person component){
        this.component = component;
    }

    public void show(){
        if(null!=component){
            component.show();
        }
    }
}
