package com.tablePerClass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Programm Started.....!!!!!!!" );
        
        
        Configuration cfg=new Configuration();
        cfg.configure("hibernate2.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        
        Employee e1=new Employee();  
          e1.setId(10);
        e1.setName("sivaji");
            
        Regular_Employee e2=new Regular_Employee();    
        e2.setName("ravi");    
        e2.setSalary(50000);    
        e2.setBonus(5);    
            
        Contract_Employee e3=new Contract_Employee();    
        e3.setName("siva");    
        e3.setPay_per_hour(1000);    
        e3.setContract_duration("15 hours");    
        
        
        
      Session session = factory.openSession();
        
        Transaction txn=session.beginTransaction();
        
        session.save(e1);
        session.save(e2);
        session.save(e3);
        
        txn.commit();
        
        session.close();
        factory.close();
        
    }
}
