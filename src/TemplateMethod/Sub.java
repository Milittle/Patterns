package TemplateMethod;

/**
 * Created by mizeshuang on 2016/6/1.
 */
public class Sub extends AbstractCalculator {
    @Override
    public int calculate(int num1, int num2) {
        return num1 - num2;
    }
}
