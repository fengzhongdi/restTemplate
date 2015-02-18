package snap.sono.demo.data;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SnapList {
	private List<String> list = new ArrayList<String>();
	public SnapList(){
		
	}
	public SnapList(List<String> list){
		this.list = list;
	}
	
	public List<String> getList(){
		return this.list;
	}
}
