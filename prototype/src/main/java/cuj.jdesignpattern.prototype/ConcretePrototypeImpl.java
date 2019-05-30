package cuj.jdesignpattern.prototype;

/**
 * @Author: cujamin
 * @ProjectName: JDesignPattern
 * @Date: 2019/5/30 9:02 PM
 * @Description: ${description}
 */
public class ConcretePrototypeImpl extends Prototype {
    public ConcretePrototypeImpl(String id) {
        super(id);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
