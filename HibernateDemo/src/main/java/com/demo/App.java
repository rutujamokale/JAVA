package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();

        Transaction tx = session.beginTransaction();
        //insert 
         Student s = new Student();
         s.setId(4);
         s.setName("reena");
         s.setMarks(80);

         session.save(s);

       // update 
        Student s1 = session.get(Student.class, 4);
        if (s1 != null) {
            s1.setMarks(90);
            session.update(s1);
        }

      //  delete

        Student s2 = session.get(Student.class, 4);
        if (s2 != null) {
            session.delete(s2);
        }

        tx.commit();

        session.close();
        factory.close();
    }
}
