package state;

public class Main {
    public static void main(String[] args) {
        StateContext obj = new StateContext();
        obj.isMeetingOn("12");

        obj.setState(new StateLive());
        obj.isMeetingOn("12");
    }
}
