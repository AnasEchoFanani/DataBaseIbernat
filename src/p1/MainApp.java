package p1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {

    public static void main(String[] args) {
        personne newPersonne = new personne(1,"Doe","John","johndoe","password123");

        // Create the Hibernate session factory
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        // Create a session
        Session session = sessionFactory.openSession();

        Transaction tx = session.beginTransaction();
        session.save(newPersonne);
        tx.commit();
        session.close();
    }
}
