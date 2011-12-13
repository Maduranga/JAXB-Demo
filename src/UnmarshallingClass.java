import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;


public class UnmarshallingClass {

	public static void main(String[] args) throws Exception {

		final JAXBContext UnmarshallingClassJAXB = JAXBContext.newInstance(Person.class);
		try {
			Person systemObject = (Person) UnmarshallingClassJAXB.createUnmarshaller().unmarshal(new FileInputStream("personoutput.xml"));
			System.out.println("Person name is " + systemObject.name);
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}

}
