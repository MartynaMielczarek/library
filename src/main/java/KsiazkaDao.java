import entity.Ksiazka;

import javax.persistence.*;
import java.util.*;

public class KsiazkaDao
{
    private static EntityManager em;

    public KsiazkaDao(EntityManager entityManager)
    {
        em = entityManager;
    }

    public void save(Ksiazka ksiazka)
    {
        em.getTransaction().begin();
        em.persist(ksiazka);
        em.getTransaction().commit();
    }

    public void findAll()
    {
        List<Ksiazka> result = em.createQuery("from entity.Ksiazka").getResultList();
        for (Ksiazka ksiazka : result) {   System.out.println(ksiazka); }

    }


    public void findById(Long id)
    {
        List<Ksiazka> result = em.createQuery("from entity.Ksiazka where id=:id")
                .setParameter("id",id)
                .getResultList();

        for (Ksiazka ksiazka : result) {   System.out.println(ksiazka); }

    }

    public void delete(Ksiazka ksiazka)

    {
        em.remove(ksiazka);
    }




}
