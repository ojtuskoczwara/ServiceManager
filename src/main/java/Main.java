import Model.SprzetEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by Wojtek on 2018-04-01.
 */
public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("bazaDanychSeriwsu");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        SprzetEntity sprzetEntity = new SprzetEntity();
        //sprzetEntity.setSprzetId(1);
        sprzetEntity.setRodzaj("Tablet");
        sprzetEntity.setMarka("Lenovo");
        sprzetEntity.setModel("BC1232");
        sprzetEntity.setNumerSeryjny("ABC1213ASDE25E");

        entityManager.getTransaction().begin();
        entityManager.persist(sprzetEntity);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
    }
}
