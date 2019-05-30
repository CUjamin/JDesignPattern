package cuj.jdesignpattern.prototype;

/**
 * @Author: cujamin
 * @ProjectName: JDesignPattern
 * @Date: 2019/5/30 9:00 PM
 * @Description: ${description}
 */
public abstract class Prototype implements Cloneable{
    private String id;

    public Prototype(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
