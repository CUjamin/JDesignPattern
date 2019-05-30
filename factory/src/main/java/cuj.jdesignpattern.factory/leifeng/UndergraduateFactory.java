package cuj.jdesignpattern.factory.leifeng;

/**
 * @Author: cujamin
 * @ProjectName: JDesignPattern
 * @Date: 2019/5/22 8:52 PM
 * @Description: ${description}
 */
public class UndergraduateFactory implements LeiFengFactory {
    @Override
    public LeiFeng createLeiFeng() {
        return new Undergraduate();
    }
}
