package cuj.jdesignpattern.proxy.v3;

/**
 * @Author: cujamin
 * @ProjectName: JDesignPattern
 * @Date: 2019/5/21 9:57 PM
 * @Description: ${description}
 */
public class Proxy implements Subject {

    private RealSubject realSubject;

    @Override
    public void request() {
        if (null == realSubject) {
            realSubject = new RealSubject();
        }
        realSubject.request();
    }
}
