package com.lf.pattern.factory.abstractfactory;

/**
 * @author sun
 * @date 2019/3/10
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        MammalAnimalFactory mammalAnimalFactory = new MammalAnimalFactory();
        mammalAnimalFactory.createLife().eat();
        mammalAnimalFactory.creatHabit().sleepTime();
    }
}
