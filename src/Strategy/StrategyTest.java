package Strategy;

/**
 * Created by mizeshuang on 2016/5/7.
 */
public class StrategyTest {
    public static void main(String[] args) {
        ICalculator plus= new Plus();
        System.out.println(plus.calculator("1+2"));
    }
}
