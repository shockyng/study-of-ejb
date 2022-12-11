package me.shockyng.chapter001;

import javax.ejb.EJBObject;
import java.rmi.RemoteException;

public interface Hello extends EJBObject {

    String helloWorld() throws RemoteException;
}
