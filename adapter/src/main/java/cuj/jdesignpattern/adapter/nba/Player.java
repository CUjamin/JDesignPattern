package cuj.jdesignpattern.adapter.nba;

/**
 * @Author: cujamin
 * @ProjectName: JDesignPattern
 * @Date: 2019/8/8 6:03 PM
 * @Description: ${description}
 */
public abstract class Player {
    protected String name;

    public Player(String name) {
        this.name = name;
    }
    public abstract void attack();
    public abstract void defense();
}
