package Ecommerce;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.jdbc.core.BeanPropertyRowMapper;    
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.plp.Plp;

  public class RegisterDao {
	JdbcTemplate template;
public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}
	public int save(CustomerDetails cus){    
String query1="insert into registerDetails values('"+cus.getId()+"','"+cus.getFirstName()+"','"+cus.getLastName()+"','"+cus.getMobileNo()+"','"+cus.getEmail()+"','"+cus.getCountry()+"')";   
	    return template.update(query1);    
	}    
	
	 public List<CustomerDetails> getcustomers(String FirstName,String email){    
		    return template.query("select * from registerdetails where FirstName='"+FirstName+"'and email='"+email+"' ",new RowMapper<CustomerDetails>(){    
		        public CustomerDetails mapRow(ResultSet rs, int row) throws SQLException {    
		        	CustomerDetails e=new CustomerDetails();    
		            e.setId(rs.getInt(1)); 
		            e.setFirstName(rs.getString(2));
		            e.setLastName(rs.getString(3));   
		            e.setEmail(rs.getString(5));    
		            e.setCountry(rs.getString(6));    
		            e.setMobileNo(rs.getLong(4));
		            return e;    
		        }    
		    });    
	  }
	  public int save1(Plp cus){    
		  String query1="insert into womenplp values('"+cus.getId()+"','"+cus.getImage()+"','"+cus.getName()+"','"+cus.getCost()+"','"+cus.getDescription()+"')";   
		  	    return template.update(query1);    
		  	}
	  public List<Plp> getproducts(){    
		    return template.query("select * from womenplp",new RowMapper<Plp>(){    
		        public Plp mapRow(ResultSet rs, int row) throws SQLException {    
		            Plp e=new Plp();    
		            e.setId(rs.getInt(1)); 
		            e.setImage(rs.getString(2));
		            e.setName(rs.getString(3));    
		            e.setCost(rs.getInt(4));    
		            e.setDescription(rs.getString(5));    
		            return e;    
		        }    
		    });    
	  }
	  public List<Plp> getProductById(int id){    
	        return template.query("select * from womenplp where id="+id,new RowMapper<Plp>(){    
	            public Plp mapRow(ResultSet rs, int row) throws SQLException {    
	                Plp e=new Plp();    
	                e.setId( rs.getInt(1));    
	                e.setImage(rs.getString(2));    
	                e.setCost(rs.getInt(4));    
	                e.setName(rs.getString(3));
	                e.setDescription(rs.getString(5));
 	                return e;    
	            }  
	});
	    }
	 //extra 
	  public List<Plp> getProductById1(int id){    
	        return template.query("select * from womenplp where id="+id,new RowMapper<Plp>(){    
	            public Plp mapRow(ResultSet rs, int row) throws SQLException {    
	                Plp e=new Plp();    
	                e.setId( rs.getInt(1));    
	                e.setImage(rs.getString(2));    
	                e.setCost(rs.getInt(4));    
	                e.setName(rs.getString(3));
	                e.setDescription(rs.getString(5));
	                System.out.println("hi");
 	                System.out.println(e);
 
 	                return e;    
	            }  
	});
	    }
	  //menshirt
	  public List<Plp> getProductByIdshirt(int id){    
	        return template.query("select * from shirt where id="+id,new RowMapper<Plp>(){    
	            public Plp mapRow(ResultSet rs, int row) throws SQLException {    
	                Plp e=new Plp();    
	                e.setId( rs.getInt(1));    
	                e.setImage(rs.getString(2));    
	                e.setCost(rs.getInt(4));    
	                e.setName(rs.getString(3));
	                e.setDescription(rs.getString(5));
	                return e;    
	            }  
	});
	    }

	 //carttable insert
	  public int insertintocart(int id,String image,String name,String cost,String  description,String username){
          String sql="insert into cart1(id,image,name,cost, description,email) values("+id+",'"+image+"', '"+name+"' ,'"+cost+"','"+ description+"','"+username+"')";   
       return template.update(sql);    
       
   }
	  public List<Plp> getProductByIdcart(String username){    
	        return template.query("select * from cart1 where email='"+username+"'",new RowMapper<Plp>(){    
	            public Plp mapRow(ResultSet rs, int row) throws SQLException {    
	                Plp e=new Plp();    
	                e.setId( rs.getInt(1));    
	                e.setImage(rs.getString(2));
	                e.setName(rs.getString(3));
	                e.setCost(rs.getInt(4));    
	               e.setDescription(rs.getString(5));
	                 return e;    
	            }  
	});
	    }
	 //ordertable
	  public int insertIntoorderById1(int id,String image,String name,int cost,String  description,String username){
          String sql="insert into orderlist values("+id+",'"+image+"', '"+name+"' ,"+cost+",'"+ description+"','"+username+"')";   
       return template.update(sql);    
       
   }
	  public List<Plp> getProductByIdorder(String username){    
	        return template.query("select * from orderlist where email='"+username+"'",new RowMapper<Plp>(){    
	            public Plp mapRow(ResultSet rs, int row) throws SQLException {    
	                Plp e=new Plp();    
	                e.setId( rs.getInt(1));    
	                e.setImage(rs.getString(2)); 
	                e.setName(rs.getString(3));
	                e.setCost(rs.getInt(4));    
 	                e.setDescription(rs.getString(5));
 	                return e;    
	            }  
	});
	    }
	
//public int save3(Plp cus){    
//		  String query1="insert into menplp values('"+cus.getId()+"','"+cus.getImage()+"','"+cus.getName()+"','"+cus.getCost()+"','"+cus.getDescription()+"')";   
//		  	    return template.update(query1);    
//		  	}
// 	  public List<Plp> gettshirt(){    
//		    return template.query("select * from menplp",new RowMapper<Plp>(){    
//		        public Plp mapRow(ResultSet rs, int row) throws SQLException {    
//		            Plp e=new Plp();    
//		            e.setId(rs.getInt(1)); 
//		            e.setImage(rs.getString(2));
//		            e.setName(rs.getString(3));    
//		            e.setCost(rs.getInt(4));    
//		            e.setDescription(rs.getString(5));    
//		            return e;    
//		        }    
//		    });    
//	  }
  public int save4(Plp cus){    
		  String query1="insert into shirt values('"+cus.getId()+"','"+cus.getImage()+"','"+cus.getName()+"','"+cus.getCost()+"','"+cus.getDescription()+"')";   
		  	    return template.update(query1);    
		  	}
	  public List<Plp> getshirt(){    
		    return template.query("select * from shirt",new RowMapper<Plp>(){    
		        public Plp mapRow(ResultSet rs, int row) throws SQLException {    
		            Plp e=new Plp();    
		            e.setId(rs.getInt(1)); 
		            e.setImage(rs.getString(2));
		            e.setName(rs.getString(3));    
		            e.setCost(rs.getInt(4));    
		            e.setDescription(rs.getString(5));    
		            return e;    
		        }    
		    });    
	  }
	//homepage
//	  public List<Plp> gethome(int id) {
//	 		return template.query("select * from homepage where id='"+id+"'",new RowMapper<Plp>(){    
//	            public Plp mapRow(ResultSet rs, int row) throws SQLException {    
//	                Plp e=new Plp();    
//	                e.setId( rs.getInt(1));    
//	                e.setImage(rs.getString(2));
//	                System.out.println(e);
//					return e;    
//	            }    
//		    });    
//	  }
	  //womentop
	  public int store(Plp cus){    
		  String query1="insert into womentop values('"+cus.getId()+"','"+cus.getImage()+"','"+cus.getName()+"','"+cus.getCost()+"','"+cus.getDescription()+"')";   
		  	    return template.update(query1);    
		  	}
	  public List<Plp> gettop(){    
		    return template.query("select * from womentop",new RowMapper<Plp>(){    
		        public Plp mapRow(ResultSet rs, int row) throws SQLException {    
		            Plp e=new Plp();    
		            e.setId(rs.getInt(1)); 
		            e.setImage(rs.getString(2));
		            e.setName(rs.getString(3));    
		            e.setCost(rs.getInt(4));    
		            e.setDescription(rs.getString(5));    
		            return e;    
		        }    
		    });    
	  }
	  public List<Plp> getProductByIdtop(int id){    
	        return template.query("select * from womentop where id="+id,new RowMapper<Plp>(){    
	            public Plp mapRow(ResultSet rs, int row) throws SQLException {    
	                Plp e=new Plp();    
	                e.setId( rs.getInt(1));    
	                e.setImage(rs.getString(2));    
	                e.setCost(rs.getInt(4));    
	                e.setName(rs.getString(3));
	                e.setDescription(rs.getString(5));
	                return e;    
	            }  
	});
	    }
	 //kitchen
	  public int store1(Plp cus){    
		  String query1="insert into   kitchen values('"+cus.getId()+"','"+cus.getImage()+"','"+cus.getName()+"','"+cus.getCost()+"','"+cus.getDescription()+"')";   
		  	    return template.update(query1);    
		  	}
	  public List<Plp> getkit(){    
		    return template.query("select * from  kitchen",new RowMapper<Plp>(){    
		        public Plp mapRow(ResultSet rs, int row) throws SQLException {    
		            Plp e=new Plp();    
		            e.setId(rs.getInt(1)); 
		            e.setImage(rs.getString(2));
		            e.setName(rs.getString(3));    
		            e.setCost(rs.getInt(4));    
		            e.setDescription(rs.getString(5));    
		            return e;    
		        }    
		    });    
	  }
	  public List<Plp> getProductByIdkit(int id){    
	        return template.query("select * from  kitchen where id="+id,new RowMapper<Plp>(){    
	            public Plp mapRow(ResultSet rs, int row) throws SQLException {    
	                Plp e=new Plp();    
	                e.setId( rs.getInt(1));    
	                e.setImage(rs.getString(2));    
	                e.setCost(rs.getInt(4));    
	                e.setName(rs.getString(3));
	                e.setDescription(rs.getString(5));
	                return e;    
	            }  
	});
	    }
//order
	  public List<Plp> getOrder(){    
	        return template.query("select * from cart1",new RowMapper<Plp>(){    
	            public Plp mapRow(ResultSet rs, int row) throws SQLException {    
	                Plp e=new Plp();    
	                int s1= rs.getInt(1);    
	                String s2=rs.getString(2);    
	               int s3=rs.getInt(4);    
	                String s4=rs.getString(3);
	                String s5=rs.getString(5);
	                System.out.println(e);
	                return e;    
	            }  
	});
	         }
	   //checkout
	    public List<Plp> getcheck(int id,String username) {
 		return template.query("select * from cart1 where id="+id+" and email='"+username+"'",new RowMapper<Plp>(){    
            public Plp mapRow(ResultSet rs, int row) throws SQLException {    
                Plp e=new Plp();    
                e.setId( rs.getInt(1));    
                e.setImage(rs.getString(2));    
                e.setCost(rs.getInt(4));    
                e.setName(rs.getString(3));
                e.setDescription(rs.getString(5));
	                System.out.println(e);

 		return e;
             }  
});
	}  
	 public int delete(int id){    
		    String sql="delete from cart1 where id="+id;    
		    return template.update(sql);    
		}
	   
	 		}