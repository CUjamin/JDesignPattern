package cuj.jdesignpattern.decorator.v3;

/**
 * @Author: cujamin
 * @ProjectName: JDesignPattern
 * @Date: 2019/5/20 10:43 PM
 * @Description: ${description}
 */
public class Person {

    public Person() {
    }

    private String name;

    public Person(String name) {
        this.name = name;
    }
    public void show(){
        System.out.println("装扮"+name);
    }
}
