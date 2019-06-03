package cuj.jdesignpattern.pubsub.v0;

/**
 * @Author: cujamin
 * @ProjectName: JDesignPattern
 * @Date: 2019/6/3 9:06 PM
 * @Description: ${description}
 */
public class StockObserver {
    private String name;
    private Secretary sub;

    public StockObserver(String name, Secretary sub) {
        this.name = name;
        this.sub = sub;
    }

    public void update() {
        System.out.println(sub.getAction()+name+"关闭股票行情，继续工作");

    }
}
