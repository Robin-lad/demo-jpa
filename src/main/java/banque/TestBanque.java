/**
 * 
 */
package banque;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import banque.entites.Adresse;
import banque.entites.AssuranceVie;
import banque.entites.Banque;
import banque.entites.Client;
import banque.entites.Compte;
import banque.entites.LivretA;
import banque.entites.Operation;
import banque.entites.Virement;

/**
 * @author robin
 *
 */
public class TestBanque {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("banque");
		EntityManager em = entityManagerFactory.createEntityManager();

		EntityTransaction et = em.getTransaction();
		et.begin();

		Banque b1 = new Banque("BanqueTest");
		em.persist(b1);
		Banque b2 = new Banque("Banque num 2");
		em.persist(b2);
		Banque b3 = new Banque("Banque num 3");
		em.persist(b3);

		Compte cpt1 = new Compte();
		cpt1.setNumero(28);
		cpt1.setSolde(1000);

		LivretA cpt2 = new LivretA();
		cpt2.setNumero(10);
		cpt2.setSolde(150);
		cpt2.setTaux(5.5);
		
		AssuranceVie cpt3 = new AssuranceVie();
		cpt3.setNumero(11);
		cpt3.setDateFin(LocalDate.of(2022, 05, 06));
		cpt3.setTaux(2.2);
		cpt3.setSolde(750);
		
		Virement v1 = new Virement();
		v1.setDate(LocalDateTime.of(2019, 12, 21, 5, 45));
		v1.setMontant(666);
		v1.setMotif("don");
		
		Operation o1 = new Operation();
		o1.setDate(LocalDateTime.of(2020, 01, 02, 6, 57));
		o1.setMontant(2000);
		o1.setMotif("paye");
		
		Operation o2 = new Operation();
		o2.setDate(LocalDateTime.of(2020, 01, 02, 8, 57));
		o2.setMontant(-200);
		o2.setMotif("achat");
		
		Client c1 = new Client();
		c1.setPrenom("Robin");
		c1.setNom("lad");
		c1.setDateNaissance(LocalDate.of(2000, 02, 20));
		c1.setBanque(b1);
		c1.setAdresse(new Adresse(15, "rue du a", 57000, "Metz"));
		c1.addCompte(cpt1);
		
		
		

		Client c2 = new Client();
		c2.setPrenom("Julien");
		c2.setNom("abc");
		c2.setDateNaissance(LocalDate.of(2010, 12, 25));
		c2.setBanque(b1);
		c2.setAdresse(new Adresse(11, "rue du b", 57123, "Metz"));
		c1.addCompte(cpt1);

		cpt1.addClient(c1);
		cpt1.addClient(c2);
		
		v1.setCompte(cpt1);
		v1.setBeneficiaire("Robin");
		cpt1.addOperation(v1);
		
		em.persist(v1);
		em.persist(cpt1);
		em.persist(c1);
		em.persist(c2);
		//===============================================

		Client c3 = new Client();
		c3.setPrenom("Paul");
		c3.setNom("abc");
		c3.setDateNaissance(LocalDate.of(2010, 12, 25));
		c3.setBanque(b2);
		c3.setAdresse(new Adresse(11, "rue du b", 57123, "Metz"));
		
		
		cpt2.addClient(c3);
		cpt3.addClient(c3);
		c3.addCompte(cpt2);
		c3.addCompte(cpt3);
		
		
		o1.setCompte(cpt3);
		cpt3.addOperation(o1);
		
		o2.setCompte(cpt3);
		cpt3.addOperation(o2);
		
		em.persist(o1);
		em.persist(o2);
		em.persist(cpt2);
		em.persist(cpt3);
		em.persist(c3);

		Client c4 = new Client();
		c4.setPrenom("Lou");
		c4.setNom("abc");
		c4.setDateNaissance(LocalDate.of(2010, 12, 25));
		c4.setBanque(b3);
		c4.setAdresse(new Adresse(11, "rue du b", 57123, "Metz"));
		em.persist(c4);

		et.commit();
		em.close();
	}
}
