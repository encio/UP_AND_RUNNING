package data;

import gui.AppMain;

import java.io.IOException;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class xml {
	
	public static xml instance = null;
	private NodeList nodelist= null;
	private Document document = null;
	

	private xml(){
		
	}
	public static xml getInstance(){
		if(instance == null)
			return instance = new xml();
		return instance;
	}
	
	
	private Document loadXml(String url){
			System.out.println("testing 0101");
	        try {
				DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
				DocumentBuilder builder = factory.newDocumentBuilder();
				Document doc = builder.parse(new URL(url).openStream());
				return doc;
			} catch (ParserConfigurationException
					| SAXException | IOException e) {
				e.printStackTrace();
			}
	       return null;
	}
	
	
	public Document getDocument() {
		return document;
	}
	public void setDocument(String url) {
		this.document = loadXml(url);
	}
	
	
	
	public NodeList getNodelist() {
		return nodelist;
	}
	public void setNodelist(String element) {
		this.nodelist = this.document.getElementsByTagName(element);
	}
	


}
