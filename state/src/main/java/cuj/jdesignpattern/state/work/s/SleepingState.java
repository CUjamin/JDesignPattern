package cuj.jdesignpattern.state.work.s;

import cuj.jdesignpattern.state.work.Work;

/**
 * @Author: cujamin
 * @ProjectName: JDesignPattern
 * @Date: 2019/8/7 2:30 PM
 * @Description: ${description}
 */
public class SleepingState implements State{
    @Override
    public void writeProgram(Work work) {
        System.out.println("当前时间："+work.getHour()+" 点，不行了，睡着了");
    }
}
