package cuj.jdesignpattern.memento.v2_game;

/**
 * @Author: cujamin
 * @ProjectName: JDesignPattern
 * @Date: 2019/8/11 12:02 AM
 * @Description: ${description}
 */
public class GameRole {
    private int vit;
    private int atk;
    private int def;

    public GameRole() {
        this.vit = 100;
        this.atk = 100;
        this.def = 100;
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public void stateDisplay(){
        System.out.println("角色当前状态：" +
                "\n 体力：" + this.vit +
                "\n 攻击力：" + this.atk +
                "\n 防御力：" + this.def +
                "\n"
        );
    }

    public void fight(){
        this.atk = 0;
        this.def = 0;
        this.vit = 0;
    }
    public RoleStateMemento saveState(){
        return new RoleStateMemento(vit,atk,def);
    }

    public void recoveryState(RoleStateMemento roleStateMemento){
        this.atk = roleStateMemento.getAtk();
        this.def = roleStateMemento.getDef();
        this.vit = roleStateMemento.getVit();

    }
}
