package cuj.jdesignpattern.state.work.s;

import cuj.jdesignpattern.state.work.Work;

/**
 * @Author: cujamin
 * @ProjectName: JDesignPattern
 * @Date: 2019/8/7 2:34 PM
 * @Description: ${description}
 */
public class RestState implements State{
    @Override
    public void writeProgram(Work work) {
        System.out.println("当前时间："+work.getHour()+" 下班回家");
    }
}
