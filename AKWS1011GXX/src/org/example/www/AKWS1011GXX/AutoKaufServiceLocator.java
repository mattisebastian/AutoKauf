/**
 * AutoKaufServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.AKWS1011GXX;

public class AutoKaufServiceLocator extends org.apache.axis.client.Service implements org.example.www.AKWS1011GXX.AutoKaufService {

    public AutoKaufServiceLocator() {
    }


    public AutoKaufServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AutoKaufServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AutoKauf
    private java.lang.String AutoKauf_address = "http://localhost:8080/AKWS1011GXX/services/AutoKauf";

    public java.lang.String getAutoKaufAddress() {
        return AutoKauf_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AutoKaufWSDDServiceName = "AutoKauf";

    public java.lang.String getAutoKaufWSDDServiceName() {
        return AutoKaufWSDDServiceName;
    }

    public void setAutoKaufWSDDServiceName(java.lang.String name) {
        AutoKaufWSDDServiceName = name;
    }

    public org.example.www.AKWS1011GXX.AutoKauf getAutoKauf() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AutoKauf_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAutoKauf(endpoint);
    }

    public org.example.www.AKWS1011GXX.AutoKauf getAutoKauf(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.example.www.AKWS1011GXX.NewBindingStub _stub = new org.example.www.AKWS1011GXX.NewBindingStub(portAddress, this);
            _stub.setPortName(getAutoKaufWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAutoKaufEndpointAddress(java.lang.String address) {
        AutoKauf_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.example.www.AKWS1011GXX.AutoKauf.class.isAssignableFrom(serviceEndpointInterface)) {
                org.example.www.AKWS1011GXX.NewBindingStub _stub = new org.example.www.AKWS1011GXX.NewBindingStub(new java.net.URL(AutoKauf_address), this);
                _stub.setPortName(getAutoKaufWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("AutoKauf".equals(inputPortName)) {
            return getAutoKauf();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.example.org/AKWS1011GXX/", "AutoKaufService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.example.org/AKWS1011GXX/", "AutoKauf"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AutoKauf".equals(portName)) {
            setAutoKaufEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
