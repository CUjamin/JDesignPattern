package cuj.jdesignpattern.state.work;

import cuj.jdesignpattern.state.work.s.ForenoonState;
import cuj.jdesignpattern.state.work.s.State;

/**
 * @Author: cujamin
 * @ProjectName: JDesignPattern
 * @Date: 2019/8/7 2:20 PM
 * @Description: ${description}
 */
public class Work {
    private State state;
    private double hour;
    private boolean taskFinished;

    public Work() {
        this.state = new ForenoonState();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public boolean getTaskFinished() {
        return taskFinished;
    }

    public void setTaskFinished(boolean taskFinished) {
        this.taskFinished = taskFinished;
    }

    public void writeProgram() {
        state.writeProgram(this);
    }

    @Override
    public String toString() {
        return "Work{" +
                "state=" + state +
                ", hour=" + hour +
                ", taskFinished=" + taskFinished +
                '}';
    }
}
