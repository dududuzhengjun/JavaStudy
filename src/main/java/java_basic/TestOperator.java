package java_basic;

import java.util.Scanner;

/**
 * @ Motto：No pains, no gains！
 * @ Project：JavaStudy
 * @ Author：duzhengjun
 * @ dateTime：2019-08-03 23:31
 */
public class TestOperator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的名字：");
        String name = scanner.nextLine();
        System.out.println("请输入你的年龄：");
        int age = scanner.nextInt();

        System.out.println("你是"+name+"，你今年"+age+"岁了。");
    }
}
