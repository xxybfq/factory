package com.lf.pattern.factory.abstractfactory;

/**
 * @author sun
 * @date 2019/3/10
 */
public class MammalAnimalLifeImpl implements ILife {
    @Override
    public void eat() {
        System.out.println("哺乳动物饮食习惯");
    }
}
