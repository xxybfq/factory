package com.lf.pattern.factory.abstractfactory;

/**
 * @author sun
 * @date 2019/3/10
 */
public class MammalAnimalHabitImpl implements IHabit {
    @Override
    public void sleepTime() {
        System.out.println("哺乳动物睡觉时间");
    }
}
