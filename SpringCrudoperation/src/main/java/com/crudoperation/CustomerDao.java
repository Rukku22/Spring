package com.crudoperation;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class CustomerDao {
JdbcTemplate template;
public void setTemplate(JdbcTemplate template) {    
    this.template = template;    
}    
public int save(Customer c){    
    String query1="insert into customer(id,name,mobileno) values('"+c.getName()+"',"+c.getId()+",'"+c.getMobileno()+"')";    
    return template.update(query1);    
}    
public int update(Customer c){    
    String query1="update customer set name='"+c.getName()+"',mobileno='"+c.getMobileno()+"' where id="+c.getId()+"";    
    return template.update(query1);    
}    
public int delete(int id){    
    String sql="delete from customer where id="+id+"";    
    return template.update(sql);    
}    
public Customer getCustomerById(int id){    
    String sql="select * from customer where id=?";    
    return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Customer>(Customer.class));    
}    
public List<Customer> geCustomers(){    
    return template.query("select * from customer",new RowMapper<Customer>(){    
		/*
		 * public Customer mapRow(ResultSet rs, int row) throws SQLException { Customer
		 * e=new Customer(); e.setId(rs.getInt(1)); e.setName(rs.getString(2));
		 * e.setMobileno(rs.getFloat(3)); return e; }
		 */

		public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
			    Customer e=new Customer();    
		            e.setId(rs.getInt(1));    
		            e.setName(rs.getString(2));    
		            e.setMobileno(rs.getLong(3));    
		             return e;    
		}    
    });    
}    
}