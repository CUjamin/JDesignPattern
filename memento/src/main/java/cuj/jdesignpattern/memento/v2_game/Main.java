package cuj.jdesignpattern.memento.v2_game;


/**
 * @Author: cujamin
 * @ProjectName: JDesignPattern
 * @Date: 2019/8/10 11:27 PM
 * @Description: ${description}
 */
public class Main {
    public static void main(String[] args) {
        GameRole lixiaoyao = new GameRole();
        lixiaoyao.stateDisplay();

        RoleStateCaretaker roleStateCaretaker = new RoleStateCaretaker();
        roleStateCaretaker.setRoleStateMemento(lixiaoyao.saveState());

        lixiaoyao.fight();
        lixiaoyao.stateDisplay();

        lixiaoyao.recoveryState(roleStateCaretaker.getRoleStateMemento());

        lixiaoyao.stateDisplay();
    }
}
