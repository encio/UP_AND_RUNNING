import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;





import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.net.*;

public class main {
	
	public static void main(String[] args){
		
		String url = "http://localhost:8080/FinalJSP/hello.jsp";
		

			
	        try {
				DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
				DocumentBuilder builder = factory.newDocumentBuilder();
				Document doc = builder.parse(new URL(url).openStream());
				
				NodeList NList = doc.getElementsByTagName("tour");
				
				for(int i = 0;  i < NList.getLength(); i++){
					
					Node node = NList.item(i);
					
					if( node.getNodeType() == Node.ELEMENT_NODE ){
						Element element = (Element)node;
						
						System.out.println(element.getElementsByTagName("tourId").item(0).getTextContent());
						System.out.println(element.getElementsByTagName("description").item(0).getTextContent());
					}
					
				}
			} catch (ParserConfigurationException
					| SAXException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

}
