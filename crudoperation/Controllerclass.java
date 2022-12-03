package com.crudoperation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Controllerclass {
@Autowired
CustomerDao dao;
@RequestMapping("/cusform")
public String showform(Model m){    
    m.addAttribute("command", new Customer());  
    return "cusform";  
    }    
@RequestMapping(value="/save",method = RequestMethod.POST)    
public String save(@ModelAttribute("cus")Customer cus){    
    dao.save(cus);    
    return "redirect:/Viewcus";
}
@RequestMapping("/Viewcus")    
public String viewemp(Model m){    
    List<Customer> list=dao.getCustomers();    
    m.addAttribute("list",list);  
    return "Viewcus";    
}   
@RequestMapping(value="/editcus/{id}")    
public String edit(@PathVariable int id, Model m){    
    Customer cus=dao.getCustomerById(id);    
    m.addAttribute("command",cus);  
    return "cuseditform";  
}
@RequestMapping(value="/editsave",method = RequestMethod.POST)    
public String editsave(@ModelAttribute("cus")Customer cus){    
    dao.update(cus);    
    return "redirect:/Viewcus";  
}   
@RequestMapping(value="/deletecus/{id}",method = RequestMethod.GET)    
public String delete(@PathVariable int id){    
    dao.delete(id);    
    return "redirect:/Viewcus";    
}     }