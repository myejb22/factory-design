package com.main;

import com.simple.factory.SimpleShoesFactory;
import com.simple.factory.impl.SimpleFactory;

/**
 * <p></p>
 *
 * @author Andy
 * @date 2018/3/5.
 */
public class SimpleShoesTest {
    public static void main(String[] args) {

        SimpleShoesFactory factory = new SimpleFactory();
        System.out.println(factory.getShoes("nike").getName());
    }
}
