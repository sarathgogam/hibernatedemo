package com.cn.pn.mn;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
                .buildSessionFactory();
         Session session = sessionFactory.openSession();  
         Transaction t = session.beginTransaction();  
       
         Employee emp1 = session.get(Employee.class, 1);
         
         //System.out.println(emp1);
         
         Employee emp2 = session.load(Employee.class, 2);
         
         //System.out.println(emp2);
         
         /*Employee newEmp = new Employee();
         newEmp.setFirstName("Sarath");    
         newEmp.setLastName("Gogam");    
         session.save(newEmp);*/
         
         /*Employee newEmp = new Employee();
         newEmp.setId(3);
         newEmp.setFirstName("Sarath");    
         newEmp.setLastName("Gogam");    
         session.saveOrUpdate(newEmp);*/
         
         
         /*Employee existedEmp = session.get(Employee.class, 1);
         existedEmp.setFirstName("Gangadhara");    
         existedEmp.setLastName("Tadiboyina");    
         session.update(existedEmp);*/
         
         
        /* Employee emp = session.get(Employee.class, 4);
         session.delete(emp);*/
         
         
         t.commit();
         session.close();  
	     sessionFactory.close();  
	      
	
		

	}

}
