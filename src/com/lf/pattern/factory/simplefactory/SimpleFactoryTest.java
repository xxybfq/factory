package com.lf.pattern.factory.simplefactory;

import com.lf.pattern.factory.IAnimal;
import com.lf.pattern.factory.ReptileAminal;

import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Calendar;

import static jdk.nashorn.internal.runtime.ListAdapter.create;

/**
 * @author sun
 * @date 2019/3/10
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {

        AnimalFactory animalFactory = new AnimalFactory();
        IAnimal reptileAniaml = animalFactory.create(ReptileAminal.class );
        reptileAniaml.descrpit();

    }
}
