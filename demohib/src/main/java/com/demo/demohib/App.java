package com.demo.demohib;

import java.util.Collection;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//    	alienName nm = new alienName();
//    	nm.setFname("prveen");
//    	nm.setMname("damdar");
//    	nm.setLname("narayan");
//       iiitian tikam = new iiitian();
//       tikam.setAid(102);
//       tikam.setAname(nm);
//       tikam.setColor("red");
    	
//    	Laptop laptop = new Laptop();
//    	laptop.setLid(102);
//    	laptop.setLname("Lenevothinkpad");
//    	
//    	Student student = new Student();
//    	student.setRollno(2017275);
//    	student.setName("tikam");
//    	student.getLaptop().add(laptop);
//    	student.setMraks(76);
//    	laptop.getStudent().add(student);
    	
       Configuration con = new Configuration().configure().addAnnotatedClass(Student.class);
    		   //.addAnnotatedClass(Laptop.class);
//       ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
       SessionFactory sf = con.buildSessionFactory();
       Session session = sf.openSession();
       Transaction tx = session.beginTransaction();
       Query q1 =  session.createQuery("from Student where rollno=2017275");
       q1.setCacheable(true);
       Student a =(Student) q1.uniqueResult();
        System.out.println(a);
//        System.out.println("tikam suvasiya");
       tx.commit();
       session.close();
       Session session1 = sf.openSession();
       Transaction tx1 = session1.beginTransaction();
       Query q2 =  session1.createQuery("from Student where rollno=2017276 ");
       q2.setCacheable(true);
       Student a1 =(Student) q2.uniqueResult();
        System.out.println(a1);

       tx1.commit();
       session1.close();
       
//       session.save(tikam);
//       tikam = (iiitian)session.get(iiitian.class,102);
//       session.save(student);
//       session.save(laptop);
       
///////////////////          Cache and second layer cache ######?///////
//       Student s1 = session.get(Student.class,2017276);
//       System.out.println(s1);
//       tx.commit();
//       session.close();
//       Session session2 = sf.openSession();
//       Transaction tx2 = session2.beginTransaction();
//     
//       Student s2 = session2.get(Student.class,2017276);
//       System.out.println(s2);
//       tx2.commit();
//       session2.close();
     
       
       
       
//       Collection<Laptop> laps = s1.getLaptop();
//       Laptop lap = session.get(Laptop.class,103 ) ;
//       System.out.println(lap.getLname());
//       System.out.println(lap.getLid());
//       System.out.println(lap.getStudent()); 



////       
//       for(Laptop l:laps) {
////    	   System.out.println(l.getLname()+" "+l.getLid());
//    	   System.out.println(l);
//       }
//       System.out.println(s1.getMraks());
//       System.out.println(s1.getMraks());
//       System.out.println(s1.getMraks());
//       System.out.println(s1.getStudent());
       
       
//       System.out.println(tikam);
          
       
       
    }
}
