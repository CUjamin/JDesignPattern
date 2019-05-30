package cuj.jdesignpattern.decorator.v2;

/**
 * @Author: cujamin
 * @ProjectName: JDesignPattern
 * @Date: 2019/5/20 10:32 PM
 * @Description: ${description}
 */
public abstract class Decorator implements Component {
    protected Component component;

    public void setComponent(Component component) {

        this.component = component;
    }

    @Override
    public void operation() {
        if (null != component) {
            component.operation();
        }

    }
}
