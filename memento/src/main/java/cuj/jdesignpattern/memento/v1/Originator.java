package cuj.jdesignpattern.memento.v1;

/**
 * @Author: cujamin
 * @ProjectName: JDesignPattern
 * @Date: 2019/8/10 11:34 PM
 * @Description: ${description}
 */
public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMemento(){
        return new Memento(state);
    }

    public  void setMemento(Memento memento){
        state = memento.getState();
    }
    public void show(){
        System.out.println("State = "+state);
    }
}
