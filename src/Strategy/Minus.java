package Strategy;

/**
 * Created by mizeshuang on 2016/5/7.
 */
public class Minus extends AbstractCalculator implements ICalculator {
    @Override
    public int calculator(String exp) {
        int[] arrayint = split(exp, "\\-");
        return arrayint[0] - arrayint[1];
    }

}
