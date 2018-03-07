package com.main;

import com.factory.Factory;
import com.factory.impl.NikeFactory;

/**
 * <p></p>
 *
 * @author Andy
 * @date 2018/3/5.
 */
public class FactoryTest {
    public static void main(String[] args) {
        Factory factory = new NikeFactory();
        System.out.println(factory.getShoes().getName());

    }
}
