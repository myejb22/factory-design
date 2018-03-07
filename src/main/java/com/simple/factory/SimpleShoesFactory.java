package com.simple.factory;

import com.simple.factory.product.Shoes;

/**
 * <p></p>
 *
 * @author Andy
 * @date 2018/3/5.
 */
public interface SimpleShoesFactory {

    Shoes getShoes(String name);
}
