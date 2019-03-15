package com.lf.pattern.factory.simplefactory;

import com.lf.pattern.factory.IAnimal;

/**
 * @author sun
 * @date 2019/3/10
 */
public class AnimalFactory {

    /**
      * @author sun
      * @date 2019/3/10
      * @param [clazz]
      * @return com.lf.pattern.factory.IAnimal
      * @description  创建不同的工厂
      */
    public IAnimal create(Class<? extends IAnimal> clazz){
        try{

            if( null!= clazz){
                return  clazz.newInstance();
            }
        }catch (Exception e ){
            e.printStackTrace();
        }
        return null;
    }
}
