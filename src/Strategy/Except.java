package Strategy;

/**
 * Created by mizeshuang on 2016/5/7.
 */
public class Except extends AbstractCalculator implements ICalculator {
    @Override
    public int calculator(String exp) {
        int[] arrayInt = split(exp, "\\/");
        return arrayInt[0] / arrayInt[1];
    }
}
