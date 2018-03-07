package com.factory.impl;

import com.factory.Factory;
import com.simple.factory.product.Shoes;
import com.simple.factory.product.impl.Nike;

/**
 * <p></p>
 *
 * @author Andy
 * @date 2018/3/5.
 */
public class NikeFactory implements Factory {

    public Shoes getShoes() {
        return new Nike();
    }
}
