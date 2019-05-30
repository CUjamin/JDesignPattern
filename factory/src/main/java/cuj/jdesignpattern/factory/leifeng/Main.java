package cuj.jdesignpattern.factory.leifeng;

/**
 * @Author: cujamin
 * @ProjectName: JDesignPattern
 * @Date: 2019/5/22 8:55 PM
 * @Description: ${description}
 */
public class Main {
    public static void main(String[] args) {
        LeiFengFactory leiFengFactory = new UndergraduateFactory();
        LeiFeng student = leiFengFactory.createLeiFeng();


        System.out.println(student.getClass().getName());
    }
}
