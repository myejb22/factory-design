package com.factory.impl;

import com.factory.Factory;
import com.simple.factory.product.Shoes;
import com.simple.factory.product.impl.Anta;

/**
 * <p></p>
 *
 * @author Andy
 * @date 2018/3/5.
 */
public class AntaFactory implements Factory {

    public Shoes getShoes() {
        return new Anta();
    }
}
