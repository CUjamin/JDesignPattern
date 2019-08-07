package cuj.jdesignpattern.state.work.s;

import cuj.jdesignpattern.state.work.Work;
import cuj.jdesignpattern.state.work.s.AfternoonState;
import cuj.jdesignpattern.state.work.s.State;

/**
 * @Author: cujamin
 * @ProjectName: JDesignPattern
 * @Date: 2019/8/7 2:25 PM
 * @Description: ${description}
 */
public class NoonState implements State {
    @Override
    public void writeProgram(Work work) {
        if(work.getHour()<13){
            System.out.println("当前时间："+work.getHour()+"点，饿了，困了，午休");
        }else {
            work.setState(new AfternoonState());
            work.writeProgram();
        }
    }
}
