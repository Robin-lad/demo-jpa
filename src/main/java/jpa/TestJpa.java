package jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import jpa.entites.Livre;

/**
 * 
 */

/**
 * @author robin
 *
 */
public class TestJpa {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu_essai");
		EntityManager em = entityManagerFactory.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();

		Livre l = em.find(Livre.class, 1);

		System.out.println(l + "\n");

		Livre l2 = new Livre(6, "TestLivre", "Ecrivain");
		em.persist(l2);

		Livre l3 = em.find(Livre.class, 5);
		System.out.println(l3);
		l3.setTitre("Du plaisir dans la cuisine");
		em.persist(l3);

		TypedQuery<Livre> query = em.createQuery("SELECT l FROM Livre l WHERE titre='Germinal'", Livre.class);
		List<Livre> results = query.getResultList();

		TypedQuery<Livre> query2 = em.createQuery("SELECT l FROM Livre l WHERE auteur='Jules Verne'", Livre.class);
		List<Livre> results2 = query2.getResultList();

		System.out.println(results);
		System.out.println(results2);

		Livre l4 = em.find(Livre.class, 6);
		em.remove(l4);

		TypedQuery<Livre> query3 = em.createQuery("SELECT l FROM Livre l", Livre.class);
		List<Livre> results3 = query3.getResultList();
		for (int i = 0; i < results3.size(); i++) {
			System.out.println(results3.get(i).getTitre() + " " + results3.get(i).getAuteur());
		}

			et.commit();
		em.close();

	}
}
