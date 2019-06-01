package cuj.jdesignpattern.facade;

/**
 * @Author: cujamin
 * @ProjectName: JDesignPattern
 * @Date: 2019/6/1 2:34 PM
 * @Description: ${description}
 */
public class Facade {
    private SubSystemOne subSystemOne;
    private SubSystemTwo subSystemTwo;
    private SubSystemThree subSystemThree;
    private SubSystemFour subSystemFour;

    public Facade() {
        subSystemOne = new SubSystemOne();
        subSystemTwo = new SubSystemTwo();
        subSystemThree = new SubSystemThree();
        subSystemFour = new SubSystemFour();
    }
    public void methodA(){
        System.out.println("方法组A");
        subSystemOne.methodOne();
        subSystemTwo.methodTwo();
        subSystemFour.methodFour();
    }
    public void methodB(){
        System.out.println("方法组B");
        subSystemTwo.methodTwo();
        subSystemThree.methodThree();
    }
}
