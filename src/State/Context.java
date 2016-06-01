package State;

/**
 * Created by mizeshuang on 2016/6/1.
 */
public class Context {
    public Context(State state) {
        this.state = state;
    }
    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void method() {
        if (state.getState().equals("state1")) {
            state.method1();
        } else if (state.getState().equals("state2")) {
            state.method2();
        }
    }
}
