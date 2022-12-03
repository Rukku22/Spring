package Crudjdbc;

import org.springframework.jdbc.core.JdbcTemplate;

public class RegisterDao {
private JdbcTemplate jdbcTemplate;  
		  
		public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
		    this.jdbcTemplate = jdbcTemplate;  
		}  
		  
		public int saveRegister(Register e){  
		    String query="insert into register values('"+e.getName()+"','"+e.getEmail()+"','"+e.getAddress()+"','"+e.getPhone()+"')";  
		    return jdbcTemplate.update(query);  
		}  
		public int updateRegister(Register e){  
		    String query="update register set name='"+e.getName()+"',Email='"+e.getEmail()+"',address='"+e.getAddress()+"', where id='"+e.getPhone()+"' ";  
		    return jdbcTemplate.update(query);  
		}  
		public int deleteRegister(Register e){  
		    String query="delete from register where id='"+e.getName()+"' ";  
		    return jdbcTemplate.update(query);  
		}  
		  
	}
