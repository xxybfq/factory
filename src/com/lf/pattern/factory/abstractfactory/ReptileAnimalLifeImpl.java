package com.lf.pattern.factory.abstractfactory;

/**
 * @author sun
 * @date 2019/3/10
 */
public class ReptileAnimalLifeImpl implements ILife {
    @Override
    public void eat() {
        System.out.println("爬行动物饮食习惯");
    }
}
