package cuj.jdesignpattern.state.work.s;

import cuj.jdesignpattern.state.work.Work;

/**
 * @Author: cujamin
 * @ProjectName: JDesignPattern
 * @Date: 2019/8/7 2:28 PM
 * @Description: ${description}
 */
public class AfternoonState implements State {
    @Override
    public void writeProgram(Work work) {
        if(work.getHour()<17){
            System.out.println("当前时间："+work.getHour()+"点，下午状态不错，继续努力");
        }else {
            work.setState(new EveningState());
            work.writeProgram();
        }
    }
}
