package StatePattern;

public class TVRemote {
	public static void main(String[] args) {
		TVContext tvContext =new TVContext();
		State startState = new TVStartState();
		State stopState = new TVStopState();
		
		tvContext.setTvState(startState);
		tvContext.doAction();
		
		tvContext.setTvState(stopState);
		tvContext.doAction();
	}
}
