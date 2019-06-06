package cuj.jdesignpattern.singleton;

/**
 * @Author: cujamin
 * @ProjectName: JDesignPattern
 * @Date: 2019/6/7 12:08 AM
 * @Description: double checked locking 双重检查
 */
public class SingletonDCL {
    private static SingletonDCL singletonDCL;

    private SingletonDCL() {
    }

    public static SingletonDCL getInstance() {
        if (null == singletonDCL) {
            synchronized (SingletonDCL.class) {
                if (null == singletonDCL) {

                    singletonDCL = new SingletonDCL();
                }
            }
        }
        return singletonDCL;
    }
}
