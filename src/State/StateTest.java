package State;

/**
 * Created by mizeshuang on 2016/6/1.
 */
public class StateTest {
    public static void main(String[] args) {
        State state = new State("state1");
        Context context = new Context(state);
        context.method();

        state.setState("state2");
        context.method();

        state.setState("state1");
        context.method();
    }
}
