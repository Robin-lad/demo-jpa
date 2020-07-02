/**
 * 
 */
package jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import jpa.entites.Client;
import jpa.entites.Emprunt;

/**
 * @author robin
 *
 */
public class TestBibliotheque {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu_essai");
		EntityManager em = entityManagerFactory.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();

		TypedQuery<Emprunt> query = em.createQuery("SELECT e FROM Emprunt e WHERE id=1", Emprunt.class);
		List<Emprunt> results = query.getResultList();
		
		System.out.println("\n"+results.get(0).getlLivres()+"\n");
		
		TypedQuery<Client> query2 = em.createQuery("SELECT c FROM Client c WHERE id=1", Client.class);
		List<Client> results2 = query2.getResultList();
		
		System.out.println("\n"+results2.get(0).getlEmpruntsClient()+"\n");
		
		et.commit();
		em.close();
		
		
	}
}
