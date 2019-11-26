
import java.io.FileOutputStream;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ParseStudents {
	DocumentBuilderFactory df;
	DocumentBuilder builder;
	Document document;

	public ParseStudents() {
		// PARSING AND CREATING TREE STRUCTURE
		df = DocumentBuilderFactory.newInstance();
		try {
			builder = df.newDocumentBuilder();
			document = builder.parse("C:\\Users\\najmlion\\eclipse-workspace2019\\DOMParser\\students.xml");
		} catch (ParserConfigurationException | SAXException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void getStudentId() {

		try {
			// RETRIEVING ALL STUDENT ELEMENTS IN THE GIVEN SAMPLE XML FILE.
			NodeList studentNodeList = document.getElementsByTagName("student");
			for (int i = 0; i < studentNodeList.getLength(); i++) {
				Element studentItem = (Element) studentNodeList.item(i);
				System.out.println(studentItem.getAttribute("id"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void deleteAndSaveGender() {
		try {
			Node firstGenderNode = document.getElementsByTagName("gender").item(0);
			firstGenderNode.getParentNode().removeChild(firstGenderNode);

			TransformerFactory tfFactory = TransformerFactory.newInstance();
			Transformer tf = tfFactory.newTransformer();
			tf.setOutputProperty(OutputKeys.INDENT, "yes");
			tf.transform(new DOMSource(document), new StreamResult(new FileOutputStream("C:\\Users\\najmlion\\eclipse-workspace2019\\DOMParser\\studentsMod.xml")));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
