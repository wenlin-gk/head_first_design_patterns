package chainOfResp;

/**
 * 抽象类
 * @author Administrator
 *
 */
public abstract class Leader {
	protected String name;
	protected Leader nextLeader; //责任链上的后继对象
	
	public Leader(String name) {
		super();
		this.name = name;
	}
	
	public void setNextLeader(Leader nextLeader) {
		this.nextLeader = nextLeader;
	}
	
	public abstract void handleRequest(LeaveRequest request);	
}
