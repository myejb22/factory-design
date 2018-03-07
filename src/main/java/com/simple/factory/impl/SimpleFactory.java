package com.simple.factory.impl;

import com.simple.factory.SimpleShoesFactory;
import com.simple.factory.product.Shoes;
import com.simple.factory.product.impl.Adidas;
import com.simple.factory.product.impl.Anta;
import com.simple.factory.product.impl.Nike;

/**
 * <p></p>
 *
 * @author Andy
 * @date 2018/3/5.
 */
public class SimpleFactory implements SimpleShoesFactory {

    public Shoes getShoes(String name) {
        if ("nike".equals(name)) {
            return new Nike();
        } else if ("adidas".equals(name)) {
            return new Adidas();
        } else if ("anta".equals(name)) {
            return new Anta();
        } else {
            System.out.println("当前工厂没有对应的产品");
            return null;
        }
    }
}
