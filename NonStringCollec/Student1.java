package SpringNew.NonStringCollec;

import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Student1 {
private int regno;
private String name;
private List<String> ans;
public Student1() {
	}
public Student1(int regno,String name,List<String> ans) {
	this.regno=regno;
	this.name=name;
	this.ans=ans;
	
}
public void displayInfo() {
 	  System.out.println(regno+""+name+""+ans);
		java.util.Iterator<String> str=ans.iterator();
		while(str.hasNext()) {
			System.out.println(str.next());
	    }  
}
}
