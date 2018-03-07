package com.abastract.sub;

import com.abastract.AbstractShoesFactory;
import com.factory.impl.AdidasFactory;
import com.factory.impl.AntaFactory;
import com.factory.impl.NikeFactory;
import com.simple.factory.product.Shoes;

/**
 * <p></p>
 *
 * @author Andy
 * @date 2018/3/5.
 */
public class ShoesFactory extends AbstractShoesFactory {

    public Shoes getNike() {
        return new NikeFactory().getShoes();
    }

    public Shoes getAdidas() {
        return new AdidasFactory().getShoes();
    }

    public Shoes getAnta() {
        return new AntaFactory().getShoes();
    }
}
