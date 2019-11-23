package java_basic;

/**
 * @ Motto：No pains, no gains！
 * @ Project：JavaStudy
 * @ Author：duzhengjun
 * @ dateTime：2019/9/6 1:10 下午
 */
public class TestLableBreak {
    public static void main(String args[]) {
        outer: for (int i = 101; i < 150; i++) {
            for (int j = 2; j < i / 2; j++) {
                if (i % j == 0){
                    continue outer;
                }
            }
            System.out.print(i + "  ");
        }
    }
}
