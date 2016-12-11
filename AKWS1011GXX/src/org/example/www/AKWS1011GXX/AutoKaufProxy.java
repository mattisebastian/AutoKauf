package org.example.www.AKWS1011GXX;

public class AutoKaufProxy implements org.example.www.AKWS1011GXX.AutoKauf {
  private String _endpoint = null;
  private org.example.www.AKWS1011GXX.AutoKauf autoKauf = null;
  
  public AutoKaufProxy() {
    _initAutoKaufProxy();
  }
  
  public AutoKaufProxy(String endpoint) {
    _endpoint = endpoint;
    _initAutoKaufProxy();
  }
  
  private void _initAutoKaufProxy() {
    try {
      autoKauf = (new org.example.www.AKWS1011GXX.AutoKaufServiceLocator()).getAutoKauf();
      if (autoKauf != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)autoKauf)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)autoKauf)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (autoKauf != null)
      ((javax.xml.rpc.Stub)autoKauf)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.example.www.AKWS1011GXX.AutoKauf getAutoKauf() {
    if (autoKauf == null)
      _initAutoKaufProxy();
    return autoKauf;
  }
  
  public boolean kaufeAuto(long autoID) throws java.rmi.RemoteException{
    if (autoKauf == null)
      _initAutoKaufProxy();
    return autoKauf.kaufeAuto(autoID);
  }
  
  public boolean verkaufeAuto(long autoID) throws java.rmi.RemoteException{
    if (autoKauf == null)
      _initAutoKaufProxy();
    return autoKauf.verkaufeAuto(autoID);
  }
  
  public AKWS1011GXX.AutoKauf.Types.Auto[] alleAutosAnzeigen(java.lang.String in) throws java.rmi.RemoteException{
    if (autoKauf == null)
      _initAutoKaufProxy();
    return autoKauf.alleAutosAnzeigen(in);
  }
  
  
}