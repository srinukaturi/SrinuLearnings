
import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.DocumentBuilder;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class readXmlDataUsingSeleniumJava {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		
		File file = new File("C://4 oct soft//Automation/pom.xml");
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.parse(file);
		doc.getDocumentElement().normalize();
		System.out.println("Root Elememnt is: "+doc.getDocumentElement().getNodeName());
		
		NodeList nodelist = doc.getElementsByTagName("dependency");
		for(int i=0;i<nodelist.getLength();i++)
		{
			Node node = nodelist.item(i);
			Element ele = (Element)node;
			//this is the check for read xml data from selenium
			
			System.out.println("value 1 of the node:"+ele.getElementsByTagName("groupId").item(0).getTextContent());
			System.out.println("value 1 of the node:"+ele.getElementsByTagName("artifactId").item(0).getTextContent());
			System.out.println("value 1 of the node:"+ele.getElementsByTagName("version").item(0).getTextContent());
			
		}
		
		
		// TODO Auto-generated method stub

	}

}
