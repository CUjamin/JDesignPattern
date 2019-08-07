package cuj.jdesignpattern.state;

/**
 * @Author: cujamin
 * @ProjectName: JDesignPattern
 * @Date: 2019/8/7 1:54 PM
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
        work.setWorkFinished(false);
        work.writeProgram();
        work.setHour(19);
        work.writeProgram();
        work.setHour(21);
        work.writeProgram();
    }
}

class Work{

    private  int hour = 0;


    private  boolean workFinished  = false;


    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public boolean isWorkFinished() {
        return workFinished;
    }

    public void setWorkFinished(boolean workFinished) {
        this.workFinished = workFinished;
    }

    public void writeProgram(){
        if(hour < 12){
            System.out.println("当前时间为："+hour+"点，上午上班时间");
        }else if(hour < 13){
            System.out.println("当前时间为："+hour+"点，饿了，午饭；反馈，午休");
        }else if(hour < 17){
            System.out.println("当前时间为："+hour+"点，下午状态还不错，继续努力");
        }else {
            if(workFinished){
                System.out.println("当前时间为："+hour+"点，下班回家了");
            }else {
                if(hour < 21){
                    System.out.println("当前时间为："+hour+"点，加班，疲惫至极");
                }else {
                    System.out.println("当前时间为："+hour+"点，不行了，睡着了");
                }
            }
        }
    }
}
