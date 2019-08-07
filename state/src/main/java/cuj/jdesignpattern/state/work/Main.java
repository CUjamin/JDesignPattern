package cuj.jdesignpattern.state.work;

/**
 * @Author: cujamin
 * @ProjectName: JDesignPattern
 * @Date: 2019/8/7 2:37 PM
 * @Description: ${description}
 */
public class Main {
    public static void main(String[] args) {
        Work work = new Work();
        work.setHour(9);
        work.writeProgram();

        work.setHour(10);
        work.writeProgram();

        work.setHour(12);
        work.writeProgram();

        work.setHour(13);
        work.writeProgram();

        work.setHour(14);
        work.writeProgram();

        work.setHour(17);
        work.setTaskFinished(false);
        work.writeProgram();

        work.setHour(19);
        work.writeProgram();

        work.setHour(22);
        work.writeProgram();
    }
}
