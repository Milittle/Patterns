package TemplateMethod;

/**
 * Created by mizeshuang on 2016/6/1.
 */
public class TemplateTest {
    public static void main(String[] args) {
        AbstractCalculator abstractCalculator = new Plus();
        System.out.println(abstractCalculator.calculate("1+2", "\\+"));

    }
}
