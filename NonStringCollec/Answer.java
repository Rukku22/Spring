package SpringNew.NonStringCollec;

public class Answer {
 		private int id;  
		private String name;  
		private String  ans1;  
		  
		public Answer() {}  
		public Answer(int id, String name, String ans1) {  
		    super();  
		    this.id = id;  
		    this.name = name;  
		    this.ans1=ans1;  
		}  
		  
		public String toString(){  
			System.out.println(id+""+name+"");
			return ans1;
			
 		}  
		}  

