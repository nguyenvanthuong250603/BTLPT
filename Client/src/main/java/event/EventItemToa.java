
package event;

import java.awt.Component;
import java.rmi.RemoteException;

import entity.Toa;

public interface EventItemToa {
    public void itemClick(Component com,Toa toa) throws RemoteException;
}
