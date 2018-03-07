package com.abastract;

import com.simple.factory.product.Shoes;

/**
 * <p></p>
 *
 * @author Andy
 * @date 2018/3/5.
 */
public abstract class AbstractShoesFactory {

    public abstract Shoes getNike();

    public abstract Shoes getAdidas();

    public abstract Shoes getAnta();
}
