package state;

public class StateLive implements MeetingState {

    @Override
    public void isMeetingOn(StateContext stateContext, String room) {
        System.out.println("Enter meeting in: "+ room);
    }
}
