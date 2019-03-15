package com.lf.pattern.factory.methodfactory;

/**
 * @author sun
 * @date 2019/3/10
 */
public class AnimalFactoryTest {
    public static void main(String[] args) {

    IAnimalFactory mammalFactory = new MammalAnimaloFactory();
    mammalFactory.create().descrpit();

    IAnimalFactory reptileAnimal = new ReptileAminalFacotry();
    reptileAnimal.create().descrpit();

    }
}
