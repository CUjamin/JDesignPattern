package cuj.jdesignpattern.factory.v1;

import cuj.jdesignpattern.simplefactory.Operation;
import cuj.jdesignpattern.simplefactory.OperationMul;

/**
 * @Author: cujamin
 * @ProjectName: JDesignPattern
 * @Date: 2019/5/22 8:35 PM
 * @Description: ${description}
 */
public class MulFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperationMul();
    }
}
