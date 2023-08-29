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

        // Create a new Cate entity
        Cate newCate = new Cate("cat");

        // Create a new personne entity and associate it with the new Cate
        personne newPersonne = new personne();
        newPersonne.setId(1);
        newPersonne.setNom("anas");
        newPersonne.setPrenom("John");
        newPersonne.setLogin("johndoe");
        newPersonne.setPass("password123");
        newPersonne.setCate(newCate); // Associate the new Cate with the new personne

        // Start a transaction
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();

        // Persist the new Cate and personne entities
        em.merge(newPersonne);

        // Commit the transaction
        transaction.commit();

        em.close();
        emf.close();
    }
}
