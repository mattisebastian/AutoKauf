/**
 * AutoKaufSoapBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.AKWS1011GXX;

public class AutoKaufSoapBindingSkeleton implements org.example.www.AKWS1011GXX.AutoKauf, org.apache.axis.wsdl.Skeleton {
    private org.example.www.AKWS1011GXX.AutoKauf impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "autoID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("kaufeAuto", _params, new javax.xml.namespace.QName("", "kaufOK"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://AKWS1011GXX/AutoKauf/Types", "kaufeAuto"));
        _oper.setSoapAction("http://www.example.org/AKWS1011GXX/kaufeAuto");
        _myOperationsList.add(_oper);
        if (_myOperations.get("kaufeAuto") == null) {
            _myOperations.put("kaufeAuto", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("kaufeAuto")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "autoID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("verkaufeAuto", _params, new javax.xml.namespace.QName("", "verkaufOK"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://AKWS1011GXX/AutoKauf/Types", "verkaufeAuto"));
        _oper.setSoapAction("http://www.example.org/AKWS1011GXX/verkaufeAuto");
        _myOperationsList.add(_oper);
        if (_myOperations.get("verkaufeAuto") == null) {
            _myOperations.put("verkaufeAuto", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("verkaufeAuto")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("alleAutosAnzeigen", _params, new javax.xml.namespace.QName("", "AutoArrayItems"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://AKWS1011GXX/AutoKauf/Types", "Auto"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://AKWS1011GXX/AutoKauf/Types", "alleAutosAnzeigen"));
        _oper.setSoapAction("http://www.example.org/AKWS1011GXX/alleAutosAnzeigen");
        _myOperationsList.add(_oper);
        if (_myOperations.get("alleAutosAnzeigen") == null) {
            _myOperations.put("alleAutosAnzeigen", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("alleAutosAnzeigen")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "farbe"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "autoID"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("farbeAendern", _params, new javax.xml.namespace.QName("", "erfolgreichGeaendert"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://www.example.org/AKWS1011GXX/", "farbeAendern"));
        _oper.setSoapAction("http://www.example.org/AKWS1011GXX/farbeAendern");
        _myOperationsList.add(_oper);
        if (_myOperations.get("farbeAendern") == null) {
            _myOperations.put("farbeAendern", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("farbeAendern")).add(_oper);
    }

    public AutoKaufSoapBindingSkeleton() {
        this.impl = new org.example.www.AKWS1011GXX.AutoKaufSoapBindingImpl();
    }

    public AutoKaufSoapBindingSkeleton(org.example.www.AKWS1011GXX.AutoKauf impl) {
        this.impl = impl;
    }
    public boolean kaufeAuto(long autoID) throws java.rmi.RemoteException
    {
        boolean ret = impl.kaufeAuto(autoID);
        return ret;
    }

    public boolean verkaufeAuto(long autoID) throws java.rmi.RemoteException
    {
        boolean ret = impl.verkaufeAuto(autoID);
        return ret;
    }

    public AKWS1011GXX.AutoKauf.Types.Auto[] alleAutosAnzeigen(java.lang.String in) throws java.rmi.RemoteException
    {
        AKWS1011GXX.AutoKauf.Types.Auto[] ret = impl.alleAutosAnzeigen(in);
        return ret;
    }

    public boolean farbeAendern(java.lang.String farbe, javax.xml.rpc.holders.LongHolder autoID) throws java.rmi.RemoteException
    {
        boolean ret = impl.farbeAendern(farbe, autoID);
        return ret;
    }

}
