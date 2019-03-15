package com.lf.pattern.factory.abstractfactory;

/**
 * @author sun
 * @date 2019/3/10
 */
public class ReptileAnimalHabitImpl implements IHabit {
    @Override
    public void sleepTime() {
        System.out.println("爬行动物睡觉时间");
    }
}
