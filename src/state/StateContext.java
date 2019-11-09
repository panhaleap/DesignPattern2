package state;

public class StateContext {
    private MeetingState currentState;
    public StateContext(){
        setState(new StateOffLine());
    }
    public void setState(MeetingState newState){
        currentState = newState;
    }
    public void isMeetingOn(String room){
        currentState.isMeetingOn(this, room);
    }
}
