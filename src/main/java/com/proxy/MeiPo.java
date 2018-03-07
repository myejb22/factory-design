package com.proxy;

import com.dao.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * <p></p>
 *
 * @author Andy
 * @date 2018/3/3.
 */
public class MeiPo implements InvocationHandler {
    private Person taget;

    public Object getInstance(Person taget) {
        this.taget = taget;
        Class clazz = taget.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }


    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("你的性别是：" + this.taget.getSex() + " 给你介绍异性朋友。");
        System.out.println("开始进行海选。。。。");
        this.taget.findByFriend();
        System.out.println("如果合适的话，就准备商量婚事。");
        return null;
    }
}
