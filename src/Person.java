import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.annotation.*;


@XmlRootElement(name = "Person")
@XmlAccessorType(XmlAccessType.FIELD)
public class Person {
	
	@XmlAttribute
    public String name;
	
	@XmlElement(name = "Person_age")
    public int age;
	
	@XmlElement
    public String company;
	
	@XmlElement
    public List<String> records = new ArrayList<String>();

}
