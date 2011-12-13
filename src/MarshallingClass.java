import java.io.FileOutputStream;

import javax.swing.JOptionPane;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class MarshallingClass {

	public static void main(String args[]) throws Exception
	{
		Person personInstance = new Person();
		personInstance.name = "Duffy Duck";
		personInstance.age = 6;
		personInstance.company = "Disney";
		personInstance.records.add("prototype");
		personInstance.records.add("Experimental");
		personInstance.records.add("commercialized");
		
		final JAXBContext jaxbContext = JAXBContext.newInstance(Person.class);
		Marshaller marsh = jaxbContext.createMarshaller();
	    marsh.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	    marsh.marshal(personInstance,new FileOutputStream("personoutput.xml"));
	}
}
