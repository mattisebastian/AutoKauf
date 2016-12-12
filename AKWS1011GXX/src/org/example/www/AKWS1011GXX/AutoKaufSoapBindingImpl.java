/**
 * AutoKaufSoapBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.AKWS1011GXX;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.rpc.holders.LongHolder;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import AKWS1011GXX.AutoKauf.Types.*;

public class AutoKaufSoapBindingImpl implements org.example.www.AKWS1011GXX.AutoKauf {
	public boolean kaufeAuto(long autoID) throws java.rmi.RemoteException {
		Auto[] autos = leseDatensaetze();
		if (autos != null) {
			for (int i = 0; i < autos.length; i++) {
				Auto auto = autos[i];
				if (auto.getAutoID() != autoID)
					continue;
				if (auto.isGekauft())
					break;
				auto.setGekauft(true);
				return schreibeDatensaetze(autos);
			}
		}
		return false;

	}

	public boolean verkaufeAuto(long autoID) throws java.rmi.RemoteException {
			Auto[] autos = leseDatensaetze();
			if (autos != null) {
				for (int i = 0; i < autos.length; i++) {
					Auto auto = autos[i];
					if (auto.getAutoID() != autoID)
						continue;
					if (!auto.isGekauft())
						break;
					auto.setGekauft(false);
					return schreibeDatensaetze(autos);
				}
			}
			return false;
		}

	public AKWS1011GXX.AutoKauf.Types.Auto[] alleAutosAnzeigen(java.lang.String in) throws java.rmi.RemoteException {

		Auto[] autos = leseDatensaetze();
		if (autos == null)
			return null;
		return autos;
	}

	public boolean farbeAendern(java.lang.String farbe, LongHolder autoID) throws java.rmi.RemoteException {
		Auto[] autos = leseDatensaetze();
		if (autos != null){
			for(int i = 0; i < autos.length; i++){
				Auto auto = autos[i];
				if (auto.getAutoID() != autoID.value)
					continue; 
				if(auto.getFarbe().equals(farbe) || farbe == null ||farbe.equals(""))
					return false;
				
				auto.setFarbe(farbe);
				return schreibeDatensaetze(autos);
			}
		}
        return false;
    }


	private boolean schreibeDatensaetze(Auto[] autos) {
		if (autos == null)
			return false;
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.newDocument();
			Element root = document.createElement("AutoArrayItems");
			root.setAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
			root.setAttribute("xsi:noNamespaceSchemaLocation", "Autos.xsd");
			for (int i = 0; i < autos.length; i++) {
				Auto auto = autos[i];
				Node autoarrayitem;
				autoarrayitem = root.appendChild(document.createElement("AutoArrayItem"));
				autoarrayitem.appendChild(document.createElement("autoID"))
						.setTextContent(String.valueOf(auto.getAutoID()));
				autoarrayitem.appendChild(document.createElement("farbe")).setTextContent(auto.getFarbe());
				autoarrayitem.appendChild(document.createElement("anzahlSitze"))
						.setTextContent(String.valueOf(auto.getAnzahlSitze()));
				autoarrayitem.appendChild(document.createElement("gekauft"))
						.setTextContent(String.valueOf(auto.isGekauft()));
			}
			document.appendChild(root);
			TransformerFactory transFactory = TransformerFactory.newInstance();
			Transformer transformer = transFactory.newTransformer();
			DOMSource source = new DOMSource(document);
			FileOutputStream fos = new FileOutputStream(new File(generiereXMLDateipfad("/data/Autos.xml")));
			StreamResult result = new StreamResult(fos);
			transformer.transform(source, result);
			return true;

		} catch (ParserConfigurationException pce) {
			pce.printStackTrace();
		} catch (TransformerConfigurationException tce) {
			tce.printStackTrace();
		} catch (TransformerException te) {
			te.printStackTrace();
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}
		return false;
	}

	private String generiereXMLDateipfad(String dateipfadrelativ) {
		String klassenname = this.getClass().getName();
		String klassenpfadrelativ = "/" + klassenname.replace(".", "/") + ".class";
		String klassenpfadabsolut = getClass().getResource(klassenpfadrelativ).getFile();
		String classespfad = klassenpfadabsolut.replace(klassenpfadrelativ, "");
		String buildpfad = classespfad.substring(0, classespfad.lastIndexOf("/"));
		String projektpfad = buildpfad.substring(0, buildpfad.lastIndexOf("/"));
		dateipfadrelativ = dateipfadrelativ.replace("\\", "/");
		if (dateipfadrelativ.charAt(0) != '/')
			dateipfadrelativ = "/" + dateipfadrelativ;

		String dateipfadabsolut = projektpfad + dateipfadrelativ;
		dateipfadabsolut = dateipfadabsolut.replace("%20", " ");
		return dateipfadabsolut;
	}

	private Auto[] leseDatensaetze() {
		Auto[] autos = null;
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			factory.setValidating(true);
			factory.setNamespaceAware(true);
			factory.setAttribute("http://java.sun.com/xml/jaxp/properties/schemaLanguage",
					"http://www.w3.org/2001/XMLSchema");
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse(new File(generiereXMLDateipfad("/data/Autos.xml")));
			Element rootElement = document.getDocumentElement();
			NodeList nodeList1 = rootElement.getChildNodes();
			ArrayList<Auto> autoarray = null;
			autoarray = new ArrayList<Auto>();
			Auto auto = null;
			for (int i = 0; i < nodeList1.getLength(); i++) {
				Node autoarrayitem = nodeList1.item(i);
				if (!autoarrayitem.getNodeName().equals("AutoArrayItem"))
					continue;
				auto = new Auto();
				NodeList nodeList2 = autoarrayitem.getChildNodes();
				for (int j = 0; j < nodeList2.getLength(); j++) {
					Node eigenschaft = nodeList2.item(j);
					if (eigenschaft.getNodeName().equals("autoID"))
						auto.setAutoID((long) Long.valueOf(eigenschaft.getTextContent()));
					if (eigenschaft.getNodeName().equals("farbe"))
						auto.setFarbe(eigenschaft.getTextContent());
					if (eigenschaft.getNodeName().equals("anzahlSitze"))
						auto.setAnzahlSitze((int) Integer.valueOf(eigenschaft.getTextContent()));
					if (eigenschaft.getNodeName().equals("gekauft"))
						auto.setGekauft((boolean) Boolean.valueOf(eigenschaft.getTextContent()));
				}
				autoarray.add(auto);
			}
			autos = (Auto[]) autoarray.toArray(new Auto[0]);
		} catch (ParserConfigurationException pce) {
			pce.printStackTrace();
		} catch (SAXException se) {
			se.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		return autos;
	}

};
