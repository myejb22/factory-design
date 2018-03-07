package com.main;

import com.abastract.sub.ShoesFactory;

/**
 * <p></p>
 *
 * @author Andy
 * @date 2018/3/5.
 */
public class abstractShoesTest {

    public static void main(String[] args) {
        ShoesFactory factory = new ShoesFactory();
        System.out.println(factory.getNike().getName());
    }
}
