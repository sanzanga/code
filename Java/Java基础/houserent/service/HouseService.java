package com.houserent.service;

import com.houserent.domain.House;

/**
 * HouseService.java => 类 【业务层】
 * 定义House[]，保存House对象
 * 1. 相应HouseView的调用
 * 2. 完成对房屋信息的各种操作[增删改查]
 */

public class HouseService {
    private House[] houses; //保存House对象
    private int houseNum = 1;//记录当前有多少个房屋信息
    private int idCounter = 1;//记录当前的id增长到哪个值

    public House find(int findId) {
        // 应该找到需要查找的 房屋信息对应的下标
        int index = -1;
        for(int i = 0; i < houseNum; i++) {
            if(houses[i].getId() == findId) {
                index = i;
                break;
            }
        }
        if(index == -1) {
            // 不存在该编号的房屋信息
            return null;
        }
        // 找到了
        // System.out.println("编号\t房主\t电话\t地址\t月租\t状态");
        // System.out.println(houses[index]);
        return houses[index];
    }

    // del方法，删除一个房屋信息
    public boolean del(int delId) {
        // 应该找到需要删除的房屋信息对应的下标
        int index = -1;
        for(int i = 0; i < houseNum; i++){
            if(delId == houses[i].getId()) {
                // 要删除的房屋信息对应的id，在数组下标为i的元素
                index = i;//使用index记录i
            }
        }
        if(index == -1) {
            // 说明delId在数组中不存在
            return false;
        }
        // 如果找到了
        for(int i = index; i < houseNum - 1; i++) {
            houses[i] = houses[i + 1];
        }
        houses[--houseNum] = null;
        return true;
    }

    public HouseService(int size) {
        // new house
        houses = new House[size];
        // 方便测试，先存入一个信息
        houses[0] = new House(1, "jack", "112", "未央区", 2000, "未出租");
    }

    // add方法，添加新对象，返回boolean
    public boolean add(House newHouse) {
        // 判断是否可以继续添加（我们不考虑数组扩容的问题）
        if(houseNum == houses.length) {
            // 不能添加了
            System.out.println("数组已满，不能再添加了...");
            return false;
        }

        houses[houseNum++] = newHouse;
        // id自增长的机制
        newHouse.setId(++idCounter);
        return true;
    }

    // list方法，返回houses
    public House[] list() {
        return houses;
    }
}
