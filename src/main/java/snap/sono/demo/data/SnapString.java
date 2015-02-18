package snap.sono.demo.data;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SnapString {
	
	private String name = "";
	public SnapString(){
		
	}
	
	public SnapString(String str){
		this.name = str;
	}
	
	@XmlElement(nillable=false)
	public String getName(){
		return this.name;
	}
}
