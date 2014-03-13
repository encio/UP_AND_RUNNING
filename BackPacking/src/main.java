import gui.AppMain;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;



import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import data.xml;

import java.io.IOException;
import java.net.*;

public class main {
	
	public static void main(String[] args){
		
		xml test = xml.getInstance();
		test.setDocument("http://localhost:8080/FinalJSP/hello.jsp");
		test.setNodelist("tour");
		
		
			
			for(int i = 0;  i < 1; i++){
				
				Node node = test.getNodelist().item(i);
				
				if( node.getNodeType() == Node.ELEMENT_NODE ){
					Element element = (Element)node;
					
					System.out.println(element.getElementsByTagName("tourId").item(0).getTextContent());
					System.out.println(element.getElementsByTagName("description").item(0).getTextContent());
				}
			}


	}
}
