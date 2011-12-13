import java.io.FileOutputStream;

import javax.swing.JOptionPane;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class MarshallingClass {

	public static void main(String args[]) throws Exception
	{
		Person personInstance = new Person();
		personInstance.name = "Maduranga";
		personInstance.age = 30;
		personInstance.company = "SLB";
		personInstance.records.add("Intern");
		personInstance.records.add("Engineer");
		personInstance.records.add("Project leader");
		
		final JAXBContext jaxbContext = JAXBContext.newInstance(Person.class);
		Marshaller marsh = jaxbContext.createMarshaller();
	    marsh.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	    marsh.marshal(personInstance,new FileOutputStream("personoutput.xml"));
	}
}
