package com.jpa.Springjpa1;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional; 
@Transactional  
public class AccountDao{  
    JdbcTemplate template;  
  
    public void setTemplate(JdbcTemplate template) {  
        this.template = template;  
    }  
    public void createAccount(int accountNumber,String owner,double balance){  
        Account account = new Account(accountNumber,owner,balance);  
        ((Object) template).persist(account);  
    }  
    public void updateBalance(int accountNumber,double newBalance){  
        Account account = template.find(Account.class, accountNumber);  
        if(account != null){  
            account.setBalance(newBalance);  
        }  
        template.merge(account);  
    }  
    public void deleteAccount(int accountNumber){  
        Account account = template.find(Account.class, accountNumber);  
        if(account != null)  
            template.remove(account);  
    }  
    public List<Account> getAllAccounts(){  
        List<Account> accounts =template.find("select acc from Account acc");  
        return accounts;  
    }  
}
