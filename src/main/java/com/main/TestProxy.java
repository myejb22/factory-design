package com.main;

import com.dao.Person;
import com.dao.impl.XiaoXingXing;
import com.proxy.MeiPo;

import java.io.FileWriter;
import java.io.IOException;

/**
 * <p></p>
 *
 * @author Andy
 * @date 2018/3/3.
 */
public class TestProxy {
    public static void main(String[] args) throws IOException {
        Person obj = (Person)new MeiPo().getInstance(new XiaoXingXing());
        obj.findByFriend();


        FileWriter fw = new FileWriter("E://$proxy0.java");
    }
}
