package cuj.jdesignpattern.simplefactory;

import java.util.Scanner;

/**
 * Created by cujamin on 2018/9/11.
 */
public class Program {
    public static void main(String[] args) {
        try
        {

            System.out.println("请输入数字A:");
            Scanner scanner = new Scanner(System.in);
            String strNumberA = scanner.nextLine();
            System.out.println("请选择运算符号：(+、—、*、/ )：");
            String strOperate =scanner.nextLine();
            System.out.println("请输入数字B:");
            String strNumberB=scanner.nextLine();
            String result="";
            result=String.valueOf(Operation.getResult(Double.parseDouble(strNumberA),Double.parseDouble(strNumberB),strOperate));
            System.out.println("结果是："+result);
        }catch (Exception e)
        {
            System.out.println("输入有错"+e.getMessage());
            e.printStackTrace();
        }
    }
}
