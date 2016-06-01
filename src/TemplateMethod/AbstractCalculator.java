package TemplateMethod;

/**
 * Created by mizeshuang on 2016/6/1.
 */
public abstract class AbstractCalculator {
    public final int calculate(String exp, String opt) {
        int[] array = split(exp, opt);
        return calculate(array[0], array[1]);
    }

    abstract public int calculate(int num1, int num2);

    public int[] split(String exp, String opt) {
        String[] array = exp.split(opt);
        int[] temp = new int[2];
        temp[0] = Integer.parseInt(array[0]);
        temp[1] = Integer.parseInt(array[1]);
        return temp;
    }
}
