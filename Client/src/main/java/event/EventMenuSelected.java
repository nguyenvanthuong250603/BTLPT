
package event;

import java.rmi.RemoteException;

public interface EventMenuSelected {
    public void menuSelected(int menuIndex, int subMenuIndex) throws RemoteException;
}
