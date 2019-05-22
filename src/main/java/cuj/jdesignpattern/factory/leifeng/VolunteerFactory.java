package cuj.jdesignpattern.factory.leifeng;

/**
 * @Author: cujamin
 * @ProjectName: JDesignPattern
 * @Date: 2019/5/22 8:53 PM
 * @Description: ${description}
 */
public class VolunteerFactory implements LeiFengFactory {
    @Override
    public LeiFeng createLeiFeng() {
        return new Volunteer();
    }
}
