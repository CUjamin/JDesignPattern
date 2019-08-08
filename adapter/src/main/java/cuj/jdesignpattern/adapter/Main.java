package cuj.jdesignpattern.adapter;

/**
 * @Author: cujamin
 * @ProjectName: JDesignPattern
 * @Date: 2019/8/8 9:35 AM
 * @Description: ${description}
 */
public class Main {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();
    }
}
