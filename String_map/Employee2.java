package SpringNew.String_map;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Employee2 {
	private int id;  
	private String name;  
	private Map<Integer,String> answers;  
	  
 public Employee2(){
 	} 
	public Employee2(int id, String name, Map<Integer, String> answers) {  
	    super();  
	    this.id = id;  
	    this.name = name;  
	    this.answers = answers;  
	}  
	  
	public void displayInfo(){  
	    System.out.println("question id:"+id);  
	    System.out.println("question name:"+name);  
	    System.out.println("Answers....");  
	    Set<Entry<Integer, String>> set=answers.entrySet();  
	    Iterator<Entry<String, String>> itr=set.iterator();  
	    while(itr.hasNext()){  
	        Entry<String,String> entry=itr.next();  
	        System.out.println("Answer:"+entry.getKey()+" Posted By:"+entry.getValue());  
	    }  
	}  
}
