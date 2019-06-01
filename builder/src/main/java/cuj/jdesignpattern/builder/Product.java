package cuj.jdesignpattern.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: cujamin
 * @ProjectName: JDesignPattern
 * @Date: 2019/6/1 2:59 PM
 * @Description: ${description}
 */
public class Product {
    private List<String> parts = new ArrayList<>();
    public void add(String part){
        parts.add(part);
    }
    public void show(){
        System.out.println("产品 创建");

        for(String part:parts){
            System.out.println(part);
        }
        System.out.println();
    }
}
