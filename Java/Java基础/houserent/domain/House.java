package com.houserent.domain;

/**
 * House对象表示一个房屋信息，House类有哪些属性
 */

public class House {
    // 编号
    private int id;
    // 房主
    private String name;
    // 电话
    private String phone;
    // 地址
    private String address;
    // 月租
    private int rent;
    // 状态(出租、未出租)
    private String state;
    public House(int id, String name, String phone, String address, int rent, String state) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.rent = rent;
        this.state = state;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getRent() {
        return rent;
    }
    public void setRent(int rent) {
        this.rent = rent;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    // 为了方便的输出对象，我们实现toString
    @Override
    public String toString() {
        return id + "\t" + name + "\t" + phone + "\t" + address + "\t" + rent
                + "\t" + state;
    }
    
}
