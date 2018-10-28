package proxy.gumball;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * 远程服务器
 */
public interface GumballMachineRemote extends Remote {
	public int getCount() throws RemoteException;
	public String getLocation() throws RemoteException;
	public State getState() throws RemoteException;
}
