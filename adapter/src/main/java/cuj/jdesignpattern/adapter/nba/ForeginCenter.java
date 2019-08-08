package cuj.jdesignpattern.adapter.nba;

/**
 * @Author: cujamin
 * @ProjectName: JDesignPattern
 * @Date: 2019/8/8 6:12 PM
 * @Description: ${description}
 */
public class ForeginCenter {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void attack() {
        System.out.println("外籍中锋 "+name+" 进攻");
    }

    public void defense() {
        System.out.println("外籍中锋 "+name+" 防守");
    }
}
