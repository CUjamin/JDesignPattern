package cuj.jdesignpattern.state.work.s;

import cuj.jdesignpattern.state.work.Work;
import cuj.jdesignpattern.state.work.s.NoonState;
import cuj.jdesignpattern.state.work.s.State;

/**
 * @Author: cujamin
 * @ProjectName: JDesignPattern
 * @Date: 2019/8/7 2:21 PM
 * @Description: ${description}
 */
public class ForenoonState implements State {
    @Override
    public void writeProgram(Work work) {
        if(work.getHour()<12){
            System.out.println("当前时间："+work.getHour()+"点，上午工作，精神百倍");
        }else {
            work.setState(new NoonState());
            work.writeProgram();
        }
    }
}
