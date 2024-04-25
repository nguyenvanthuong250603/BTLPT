
package event;

import java.awt.Component;
import java.rmi.RemoteException;

import model.Model_Tau;


public interface EvenItemTau {
    public void itemClick(Component com, Model_Tau item) throws RemoteException;
}
