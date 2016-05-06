package Facade;

/**
 * Created by mizeshuang on 2016/5/6.
 */
public class FacadeTest {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startup();
        computer.shutdown();
    }
}
