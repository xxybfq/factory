package com.lf.pattern.factory;

/**
 * @author sun
 * @date 2019/3/10
 */
public class MammalAnimal implements IAnimal {
    @Override
    public void descrpit() {
        System.out.println(" 这是哺乳动物!");
    }
}
