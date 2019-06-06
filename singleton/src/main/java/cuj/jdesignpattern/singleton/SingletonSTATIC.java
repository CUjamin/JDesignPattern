package cuj.jdesignpattern.singleton;

/**
 * @Author: cujamin
 * @ProjectName: JDesignPattern
 * @Date: 2019/6/7 12:21 AM
 * @Description: ${description}
 */
public class SingletonSTATIC {
    private static SingletonSTATIC singletonSTATIC = new SingletonSTATIC();
    private SingletonSTATIC(){}
    private static SingletonSTATIC getInstance(){
        return singletonSTATIC;
    }
}
