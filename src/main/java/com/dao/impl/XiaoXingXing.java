package com.dao.impl;

import com.dao.Person;

/**
 * <p></p>
 *
 * @author Andy
 * @date 2018/3/3.
 */
public class XiaoXingXing implements Person {
    private String sex = "女";
    private String name = "小星星";

    public void findByFriend() {
        System.out.println("我的名字叫："+this.name+",性别："+this.sex);
        System.out.println("我要找对象的条件：");
        System.out.println("1、长相必须要帅；");
        System.out.println("2、身高180cm，体重：70kg");
        System.out.println("3、有车有房");
    }

    public String getSex() {
        return this.sex;
    }

    public String getName() {
        return this.name;
    }
}
