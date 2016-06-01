package State;

/**
 * Created by mizeshuang on 2016/6/1.
 */
public class State {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public State(String state) {
        this.state = state;
    }

    public void method1() {
        System.out.println("method1");
    }

    public void method2() {
        System.out.println("method2");
    }
}
