package com.lf.pattern.factory.methodfactory;

import com.lf.pattern.factory.IAnimal;
import com.lf.pattern.factory.MammalAnimal;

/**
 * @author sun
 * @date 2019/3/10
 */
public class MammalAnimaloFactory implements  IAnimalFactory {

    @Override
    public IAnimal create() {
        return new MammalAnimal();
    }
}
