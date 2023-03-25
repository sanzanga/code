package com.object_;

/*
 * 1、当对象被回收时，系统自身调用该对象的finalize方法，子类可以重写该方法，做一些释放资源的操作
 * 2、什么时候被回收：当某个对象没有任何引用时，则jvm就认为这个对象时一个垃圾对象，就会使用来及回收机制来销毁该对象
 *    则销毁该对象前，会无调用
 * 3、垃圾回收机制的调用，是由系统决定的，也可以通过System.gc()主动触发垃圾回收
 */

public class Finalize_ {
    public static void main(final String[] args) {
        Car car = new Car("宝马");
        // 这时 car对象就是一个垃圾，垃圾回收器就会回收（销毁）对象
        // 这个原本的空间就会用来分配给其他的对象
        // 在对象销毁前，就会调佣该对象的finalize方法
        // 如果不重写，就会调用Object类的 finalize，即默认处理
        // 如果程序员重写了finalize，就可以实现自己的逻辑
        car = null;

        // 主动调用垃圾回收器
        System.gc();

        System.out.println("程序退出");
    }
}


class Car {
    private final String name;

    public Car(final String name) {
        this.name = name;
    }

    // 重写finlaize
    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        // super.finalize();//默认处理

        System.out.println("我们销毁汽车" + name);
        System.out.println("释放了一些资源");
    }
}
