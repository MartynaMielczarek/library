import javax.persistence.EntityManager;
import entity.*;
import entity.Ksiazka;

public class DemoApp {
    public static void main(String[] args) {

        EntityManager em = HibernateUtil.getEntityManager();

        Ksiazka ksiazka=new Ksiazka();
        ksiazka.setTytul("Ogniem i Mieczem");
        ksiazka.setData_wydania("1990");
        ksiazka.setISBN("128464646");

        Ksiazka ksiazka1=new Ksiazka();
        ksiazka1.setTytul("Harry Potter");
        ksiazka1.setData_wydania("2002");
        ksiazka1.setISBN("66646466");

        KsiazkaDao ksiazkaDao= new KsiazkaDao(em);
        ksiazkaDao.save(ksiazka);
        ksiazkaDao.save(ksiazka1);

        ksiazkaDao.findAll();
        ksiazkaDao.findById((long)1);
        ksiazkaDao.delete(ksiazka1);


        Adres adres=new Adres();
        adres.setKraj("Polska");
        adres.setMiasto("Wrocłąw");
        adres.setUlica("Kościuszki");
        adres.setNumer("2D");

        Adres adres1=new Adres();
        adres1.setKraj("Polska");
        adres1.setMiasto("Wrocław");
        adres1.setUlica("Rynek");
        adres1.setNumer("8A");


        Autor autor=new Autor();
        autor.setImie("Adam");
        autor.setNazwisko("Mickiewicz");
        autor.setData_urodzenia("1799");
        autor.setAdres(adres);

        Autor autor1=new Autor();
        autor1.setImie("Julian");
        autor1.setNazwisko("Tuwim");
        autor1.setData_urodzenia("1894");
        autor1.setAdres(adres1);

        AutorDao autorDao=new AutorDao(em);
        autorDao.save(autor);
        autorDao.save(autor1);
        autorDao.findAll();
        autorDao.findById((long)2);

        HibernateUtil.closeEntityManager();




    }
}
