package cuj.jdesignpattern.state.work.s;

import cuj.jdesignpattern.state.work.Work;

/**
 * @Author: cujamin
 * @ProjectName: JDesignPattern
 * @Date: 2019/8/7 2:29 PM
 * @Description: ${description}
 */
public class EveningState implements State{
    @Override
    public void writeProgram(Work work) {
        if(work.getTaskFinished()){
            work.setState(new RestState());
            work.writeProgram();
        }else {
            if(work.getHour()<21){
                System.out.println("当前时间："+work.getHour()+"点，加班后，疲累之极");
            }else {
                work.setState(new SleepingState());
                work.writeProgram();
            }
        }
    }
}
