package java_basic.object;

/**
 * @ Motto：No pains, no gains！
 * @ Project：JavaStudy
 * @ Author：duzhengjun
 * @ dateTime：2019/11/9 6:24 下午
 */

class Computer{
    String brand;   //品牌
}

public class SxtStu {

    //属性attribute
    int id;
    String sname;
    int age;

    Computer comp;  //计算机

    //方法method
    void study(){
        System.out.println("我在认真学习！"+"使用的是"+comp.brand+"电脑");
    }

    void play(){
        System.out.println("我在玩游戏！");
    }

    //构造方法。用于创建这个类的对象。无参的构造方法可以由系统自动创建。
    SxtStu(){
        System.out.println("调用了无参的构造方法！");
    }

    //程序执行的入口，必须要有
    //javac  Sxtstu.java   ,   java Sxtstu
    public static void main(String[] args) {
        SxtStu stu = new SxtStu();  //创建一个对象
        stu.id = 1001;
        stu.sname = "杜征骏";
        stu.age = 18;

        Computer c1 = new Computer();
        c1.brand = "MacBook Pro";

        stu.comp = c1;

        stu.play();
        stu.study();
    }

}

