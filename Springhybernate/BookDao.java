package com.Springhybernate;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import jakarta.transaction.Transactional;

public class BookDao {


	private HibernateTemplate template;
	
	

//	public BookDao() {
//		super();
//	}
//
//	public BookDao(HibernateTemplate template) {
//		super();
//		this.template = template;
//	}
//
//	public HibernateTemplate getTemplate() {
//		return template;
//	}
//
//	public void setTemplate(HibernateTemplate template) {
//		this.template = template;
//	}
	
	@Transactional
	public void saveBook(Book e) {
		template.save(e);
	}

	public void updateBook(Book e) {
		template.update(e);
	}

	public void deleteBook(Book e) {
		template.delete(e);
	}

	public Book getById(int id) {
		Book e = (Book) template.get(Book.class, id);
		return e;
	}

	public List<Book> getBook() {
		List<Book> list = new ArrayList<Book>();
		list = template.loadAll(Book.class);
		return list;
	}
}
