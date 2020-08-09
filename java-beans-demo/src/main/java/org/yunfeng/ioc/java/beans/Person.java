package org.yunfeng.ioc.java.beans;

/**
 * POJO
 * setter/getter 方法
 * 可写方法（writable）/可读方法（readable）
 */
public class Person {

    /**
     * property
     */
    String name;

    Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
