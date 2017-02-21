/**
 * AutoKauf.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.AKWS1011GXX;

public interface AutoKauf extends java.rmi.Remote {
    public boolean kaufeAuto(long autoID, long userID) throws java.rmi.RemoteException;
    public boolean verkaufeAuto(long autoID) throws java.rmi.RemoteException;
    public AKWS1011GXX.AutoKauf.Types.Auto[] alleAutosAnzeigen(java.lang.String in) throws java.rmi.RemoteException;
    public boolean farbeAendern(java.lang.String farbe, javax.xml.rpc.holders.LongHolder autoID) throws java.rmi.RemoteException;
    public boolean checkLogin(java.lang.String id, java.lang.String password) throws java.rmi.RemoteException;
}
