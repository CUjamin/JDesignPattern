package cuj.jdesignpattern.proxy.v3;

/**
 * @Author: cujamin
 * @ProjectName: JDesignPattern
 * @Date: 2019/5/21 9:56 PM
 * @Description: ${description}
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("真是请求");
    }
}
