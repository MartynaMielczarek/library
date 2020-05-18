import entity.Autor;

import javax.persistence.*;
import java.util.*;

public class AutorDao
{
    private static EntityManager em;

    public AutorDao(EntityManager entityManager)
    {
        em = entityManager;
    }

    public void save(Autor autor)
    {
        em.getTransaction().begin();
        em.persist(autor);
        em.getTransaction().commit();
    }

    public void findAll()
    {
        List<Autor> result = em.createQuery("from entity.Autor").getResultList();
        for (Autor autor : result)
        {   System.out.println(autor); }

    }


    public void findById(Long id)
    {
        List<Autor> result = em.createQuery("from entity.Autor where id=:id")
                .setParameter("id",id)
                .getResultList();

        for (Autor autor : result) {   System.out.println(autor); }

    }

    public void delete(Autor autor)

    {
        em.remove(autor);
    }




}
