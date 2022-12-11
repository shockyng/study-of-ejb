package me.shockyng.chapter001;

import javax.ejb.EJBObject;
import java.rmi.RemoteException;

/**
 * This is the HelloBean remote interface
 *
 * This interface is what clients operate on when they interact with EJB object
 * The container vendor will implement this interface; the implemented object
 * is the EJB object, which delegates invacations to the actual bean.
 */

public interface Hello extends EJBObject {

    /**
     * The one method - hello - returns a greeting to the client.
     * @return some greeting
     * @throws RemoteException
     */
    String hello() throws RemoteException;
}
