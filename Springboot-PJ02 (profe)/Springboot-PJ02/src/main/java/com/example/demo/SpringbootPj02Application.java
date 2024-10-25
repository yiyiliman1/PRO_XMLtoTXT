package com.example.demo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.example.demo.utils.procesamientoXML;

@SpringBootApplication
public class SpringbootPj02Application {
//	SpringApplication.run(SpringbootPj02Application.class, args);
	private static final String FILENAME = "src/main/resources/static/staff.xml";
	private static final String OutputFile = "src/main/resources/static/salida.txt";

	public static void main(String[] args) throws IOException {
		// llamada al metodo lectorXML
		procesamientoXML miXML = new procesamientoXML();
		ArrayList<String> miArrStr = miXML.lectorXML(FILENAME);
		PrintWriter writer = new PrintWriter(new FileWriter(OutputFile));
		
		for (String x:miArrStr) {
			writer.println(x);
		}
		writer.close();		
	}

}
