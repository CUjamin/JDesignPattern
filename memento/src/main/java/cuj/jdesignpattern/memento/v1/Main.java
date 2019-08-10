package cuj.jdesignpattern.memento.v1;

/**
 * @Author: cujamin
 * @ProjectName: JDesignPattern
 * @Date: 2019/8/10 11:39 PM
 * @Description: 把要保存的细节给封装在 Memento 中，需要修改保存的细节也不会影响客户端 */
public class Main {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("On");
        originator.show();

        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());

        originator.setState("Off");
        originator.show();

        originator.setMemento(caretaker.getMemento());
        originator.show();

    }
}
