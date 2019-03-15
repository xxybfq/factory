package com.lf.pattern.factory.abstractfactory;

/**
 * @author sun
 * @date 2019/3/10
 */
public class ReptileAnimalFactory implements IAnimalFactory {
    @Override
    public IHabit creatHabit() {
        return new ReptileAnimalHabitImpl();
    }

    @Override
    public ILife createLife() {
        return new ReptileAnimalLifeImpl();
    }
}
