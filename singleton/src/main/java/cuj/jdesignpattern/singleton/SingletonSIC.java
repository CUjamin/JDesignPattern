package cuj.jdesignpattern.singleton;

/**
 * @Author: cujamin
 * @ProjectName: JDesignPattern
 * @Date: 2019/6/7 12:25 AM
 * @Description: 静态内部类
 */
public class SingletonSIC {
    private static class Instance{
        private static SingletonSIC singletonSIC = new SingletonSIC();
    }

    public static SingletonSIC getInstance(){
        return Instance.singletonSIC;
    }
}
