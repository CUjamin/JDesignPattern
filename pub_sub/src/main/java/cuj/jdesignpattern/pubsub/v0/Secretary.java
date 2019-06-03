package cuj.jdesignpattern.pubsub.v0;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author: cujamin
 * @ProjectName: JDesignPattern
 * @Date: 2019/6/3 9:05 PM
 * @Description: ${description}
 */
public class Secretary {
    //同时列表
    private List<StockObserver> observerList = new LinkedList<>();
    private String action;

    public String getAction() {
        return action;
    }

    /**
     * 增加同事
     * @param stockObserver
     */
    public void attach(StockObserver stockObserver){
        observerList.add(stockObserver);
    }

    public void notify2(){
        for (StockObserver stockObserver:observerList){
            stockObserver.update();
        }
    }

    //前台状态
    public void secretaryAction(String action) {
        this.action = action;
    }
}

