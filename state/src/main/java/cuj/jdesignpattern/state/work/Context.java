package cuj.jdesignpattern.state.work;

import cuj.jdesignpattern.state.work.s.State;

/**
 * @Author: cujamin
 * @ProjectName: JDesignPattern
 * @Date: 2019/8/7 2:14 PM
 * @Description: ${description}
 */
public class Context {
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
        System.out.println("当前状态："+state.toString());
    }
}
