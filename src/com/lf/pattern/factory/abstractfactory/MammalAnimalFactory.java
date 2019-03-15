package com.lf.pattern.factory.abstractfactory;

/**
 * @author sun
 * @date 2019/3/10
 */
public class MammalAnimalFactory implements IAnimalFactory {
    @Override
    public IHabit creatHabit() {
        return new MammalAnimalHabitImpl();
    }

    @Override
    public ILife createLife() {
        return new MammalAnimalLifeImpl();
    }
}
