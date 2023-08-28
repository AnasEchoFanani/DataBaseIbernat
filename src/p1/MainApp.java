package p1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainApp {

    public static void main(String[] args) {
        // Create an EntityManagerFactory based on the persistence unit defined in persistence.xml
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");

        // Create an EntityManager
        EntityManager em = emf.createEntityManager();

        // Create a new personne instance
        personne newPersonne = new personne(1, "Doe", "John", "johndoe", "password123");

        // Start a transaction
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        // Persist the newPersonne entity
        em.merge(newPersonne);
        transaction.commit();
        em.close();

        emf.close();
    }
}
