package java_basic;

/**
 * @ Motto：No pains, no gains！
 * @ Project：JavaStudy
 * @ Author：duzhengjun
 * @ dateTime：2019-08-19 21:05
 */
public class TestWhile {
    public static void main(String[] args) {
        int a=0;
        int sum1=0;
        int sum2=0;
        while(a<=100){
            while(a%2==0){
                sum1+=a;
                a++;
            }
            sum2+=a;
            a++;
        }
        System.out.println("偶数和为："+sum1+"\n"+"奇数和为："+sum2);
    }
}
