package racinggame.view;

public class InputState {
    private static String state;

    private InputState() {
    }

    public static void ready() {
        state = "ready";
    }

    public static boolean isReady() {
        return state.equals("ready");
    }

    public static void start() {
        state = "start";
    }
}
