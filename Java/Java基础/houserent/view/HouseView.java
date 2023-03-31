package com.houserent.view;

import com.houserent.domain.House;
import com.houserent.service.HouseService;
import com.houserent.utils.Utility;

/**
 * 1. 显示界面
 * 2. 接受用户的输入
 * 3. 调用HouseService完成对房屋信息的各种操作
 */

public class HouseView {
    private boolean loop = true;//控制显示菜单
    private char key = ' ';//接受用户选择
    private HouseService houseService = new HouseService(2);

    // 修改房屋信息
    public void updateHouse() {
        System.out.println("\n----------------修改房屋信息----------------");
        System.out.print("请输入修改的房屋的编号(-1退出)：");
        int updateId = Utility.readInt();
        if(updateId == -1) {
            System.out.println("\n--------------放弃修改房屋信息--------------");
            return;
        }
        // 根据输入id查找对象
        House house = houseService.find(updateId);
        if(house == null) {
            // 没找到
            System.out.println("\n--------------修改房屋信息失败--------------");
            return;
        }

        System.out.print("姓名(" + house.getName() + ")：");
        // 这里如果用户直接回车表示不修改该信息，默认就是空串
        String name = Utility.readString(8, "");
        if(!"".equals(name)) {
            house.setName(name);
        }

        System.out.print("电话(" + house.getPhone() + ")：");
        String phone = Utility.readString(12, "");
        if(!"".equals(phone)) {
            house.setPhone(phone);
        }

        System.out.print("地址(" + house.getAddress() + ")：");
        String address = Utility.readString(18, "");
        if(!"".equals(address)) {
            house.setAddress(address);
        }

        System.out.print("租金(" + house.getRent() + ")：");
        int rent = Utility.readInt(-1);
        if(rent != -1) {
            house.setRent(rent);
        }

        System.out.print("状态(" + house.getAddress() + ")：");
        String state = Utility.readString(3, "");
        if(!"".equals(state)) {
            house.setState(state);
        }

        System.out.println("\n--------------修改房屋信息成功--------------");
    }

    // 查找房屋信息
    public void findHouse() {
        System.out.println("\n----------------查找房屋信息----------------");
        System.out.print("请输入查找的房屋的编号(-1退出)：");
        int findId = Utility.readInt();
        if(findId == -1) {
            System.out.println("\n--------------放弃查找房屋信息--------------");
            return;
        }
        House house = houseService.find(findId);
        if(house == null) {
            System.out.println("\n--------------查找房屋信息失败--------------");
            return;
        }

        System.out.println("编号\t房主\t电话\t地址\t月租\t状态");
        System.out.println(house);
    }

    // 完成退出确认
    public void exit() {
        char c = Utility.readComfirmSelection();
        if(c == 'Y') {
            loop = false;
        }
    }

    // 编写delHouse(),界面，接受用户输入
    public void delHouse() {
        System.out.println("\n----------------删除房屋信息----------------");
        System.out.print("请输入删除的房屋的编号(-1退出)：");
        int delId = Utility.readInt();
        if(delId == -1) {
            System.out.println("\n--------------放弃删除房屋信息--------------");
            return;
        }
        char choice = Utility.readComfirmSelection();//注意该方法本身就有判断循环的逻辑，必须输出Y/N
        if(choice == 'Y'){
            // 确认删除
            if(houseService.del(delId)) {
                System.out.println("\n----------------删除房屋成功----------------");
            }else {
                System.out.println("\n----------------删除房屋失败----------------");
            }
        }else {
            System.out.println("\n--------------放弃删除房屋信息--------------");
        }
    }

    // 编写addHouse() 接受输入，创建House对象，调用add方法
    public void addHouse() {
        System.out.println("\n----------------添加房屋----------------");
        System.out.print("姓名：");
        String name = Utility.readString(8);
        System.out.print("电话：");
        String phone = Utility.readString(12);
        System.out.print("地址：");
        String address = Utility.readString(16);
        System.out.print("月租：");
        int rent = Utility.readInt();
        System.out.print("状态：");
        String state = Utility.readString(3);
        // 创建一个新的House对象，注意id是系统分配的
        House newHouse = new House(0, name, phone, address, rent, state);
        if(houseService.add(newHouse)) {
            System.out.println("\n----------------添加房屋成功----------------");
        }else {
            System.out.println("\n----------------添加房屋失败----------------");
        }
    }

    // 编写listHouses() 显示房屋列表
    public void listHouses() {
        System.out.println("\n----------------房屋列表----------------");
        System.out.println("编号\t房主\t电话\t地址\t月租\t状态");
        House[] houses = houseService.list();
        
        for(int i = 0; i < houses.length; i++) {
            if(houses[i] != null) {
                System.out.println(houses[i]);
            }
        }
        System.out.println("房屋列表显示完毕");
    }

    // 显示菜单
    public void mainMenu() {
        do{
            System.out.println("----------------房屋出租系统菜单----------------");
            System.out.println("\t\t1 新 增 房 源");
            System.out.println("\t\t2 查 找 房 屋");
            System.out.println("\t\t3 删 除 房 屋 信 息");
            System.out.println("\t\t4 修 改 房 屋 信 息");
            System.out.println("\t\t5 房 屋 列 表");
            System.out.println("\t\t6 退       出");
            System.out.print("请输入您的选择(1-6)：");
            key = Utility.readChar();
            switch (key) {
                case '1':
                    this.addHouse();
                    break;
                case '2':
                    this.findHouse();
                    break;
                case '3':
                    this.delHouse();
                    break;
                case '4':
                    this.updateHouse();
                    break;
                case '5':
                    this.listHouses();
                    break;
                case '6':
                    this.exit();
                    break;
                default:
            }
        }while(loop);
    }
}
