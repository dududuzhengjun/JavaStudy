package java_basic;

/**
 * @ Motto：No pains, no gains！
 * @ Project：JavaStudy
 * @ Author：duzhengjun
 * @ dateTime：2019-08-10 17:43
 */
public class TestIfElseIf {
    public static void main(String[] args) {
        double random = 100*Math.random();
        System.out.println(random);
        if (random>=85){
            System.out.println("等级A");
        }else if (random<85&&random>=70){
            System.out.println("等级B");
        }else if (random<70&&random>=60){
            System.out.println("等级C");
        }else if (random<60){
            System.out.println("等级D");
        }

    }
}
