package com.example.demo.utils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.example.demo.models.staff;

public class procesamientoXML {
	public ArrayList<String> lectorXML (String FILENAME){
		ArrayList<String> salida = new ArrayList();
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		try {
			dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.parse(new File(FILENAME));
			doc.getDocumentElement().normalize();
        //-----<
        //System.out.println("Root Element :" + doc.getDocumentElement().getNodeName());
			salida.add("Root Element :" + doc.getDocumentElement().getNodeName());	
        //----->
        NodeList list = doc.getElementsByTagName("staff");
        for (int temp = 0; temp < list.getLength(); temp++) {
            Node node = list.item(temp);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
 
                String id = element.getAttribute("id");
                String fn = element.getElementsByTagName("firstname").item(0).getTextContent();
                String ln = element.getElementsByTagName("lastname").item(0).getTextContent();
                String nn = element.getElementsByTagName("nickname").item(0).getTextContent();
                
                NodeList salaryNodeList = element.getElementsByTagName("salary");
                
                String sl = salaryNodeList.item(0).getTextContent();
                String cr = salaryNodeList.item(0).getAttributes().getNamedItem("currency").getTextContent();

                staff miStaff = new staff(id,fn,ln,nn,sl,cr);

                //-----<
                //System.out.println("Current Element :" + node.getNodeName());
                //System.out.println("Staff Id : " + id);
                //System.out.println("First Name : " + firstname);
                //System.out.println("Last Name : " + lastname);
                //System.out.println("Nick Name : " + nickname);
                //System.out.printf("Sal}ary [Currency] : %,.2f [%s]%n%n", Float.parseFloat(salary), currency);
              //----->
                salida.add(miStaff.toString());
            }
        }
    } catch (ParserConfigurationException | SAXException | IOException e) {
        e.printStackTrace();
    }
	return salida;
}
}
