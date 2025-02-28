import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

public class ReadUsers {

    public void redUsers() throws SAXException,
            IOException, ParserConfigurationException {

        File xmlFile = new File("users.xml");
        
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = factory.newDocumentBuilder();
        Document doc = dBuilder.parse(xmlFile);

        doc.getDocumentElement().normalize();

        System.out.println("Root element: " + doc.getDocumentElement().getNodeName());

        NodeList users = doc.getElementsByTagName("user");

        for (int i = 0; i < users.getLength(); i++) {

            Node user = users.item(i);

            System.out.println("\nCurrent Element: " + user.getNodeName());

            if (user.getNodeType() == Node.ELEMENT_NODE) {

                Element elem = (Element) user;

                String uid = elem.getAttribute("id");

                Node node1 = elem.getElementsByTagName("firstname").item(0);
                String fname = node1.getTextContent();

                Node node2 = elem.getElementsByTagName("lastname").item(0);
                String lname = node2.getTextContent();

                Node node3 = elem.getElementsByTagName("occupation").item(0);
                String occup = node3.getTextContent();

                System.out.println("User id:"+ uid);
                System.out.println("First name: "+ fname);
                System.out.println("Last name: " + lname);
                System.out.println("Occupation: " +occup);
            }
        }
    }
}