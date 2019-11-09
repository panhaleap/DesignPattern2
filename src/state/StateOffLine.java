package state;

public class StateOffLine implements MeetingState {
    @Override
    public void isMeetingOn(StateContext stateContext, String room) {
        System.out.println("Meeting not started in room: "+ room);
    }
}
