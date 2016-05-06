package Decorator;

/**
 * Created by mizeshuang on 2016/5/6.
 */
/*相当于对象适配器的实现，在装饰者里面会有一个被装饰者的对象，用这个对象来调用它本来的方法*
 *但是与此同时，在装饰者的方法里也会有新的功能加入到这个接口中
 */
public class Decorator implements Sourceable {
    private Sourceable sourceable;

    public Decorator(Sourceable sourceable) {
        super();
        this.sourceable = sourceable;
    }

    @Override
    public void method() {
        System.out.println("before decorator");
        sourceable.method();
        System.out.println("after decorator");
    }
}
