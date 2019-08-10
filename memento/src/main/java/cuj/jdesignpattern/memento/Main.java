package cuj.jdesignpattern.memento;

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

        GameRole backup = new GameRole();
        backup.setAtk(lixiaoyao.getAtk());
        backup.setDef(lixiaoyao.getDef());
        backup.setVit(lixiaoyao.getVit());

        lixiaoyao.fight();
        lixiaoyao.stateDisplay();


        lixiaoyao.setAtk(backup.getAtk());
        lixiaoyao.setDef(backup.getDef());
        lixiaoyao.setVit(backup.getVit());

        lixiaoyao.stateDisplay();
    }
}
