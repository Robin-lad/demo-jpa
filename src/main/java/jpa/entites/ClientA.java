/**
 * 
 */
package jpa.entites;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author robin
 *
 */
@Entity
@Table(name = "CLIENT")
public class ClientA {
	/** id id */
	@Id
	@Column(name = "ID")
	private int id;

	/** nom nom */
	@Column(name = "NOM")
	private String nom;

	/** prenom prenom */
	@Column(name = "PRENOM")
	private String prenom;

	/** lEmpruntsClient liste des emprunts du client */
	@OneToMany(mappedBy = "client")
	private List<Emprunt> lEmpruntsClient;

	/**
	 * Constructeur
	 * 
	 */
	public ClientA() {
		super();
		lEmpruntsClient = new ArrayList<>();
	}

	/**
	 * Constructeur
	 * 
	 * @param id
	 * @param nom
	 * @param prenom
	 */
	public ClientA(int id, String nom, String prenom) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		lEmpruntsClient = new ArrayList<>();
	}

	/**
	 * Constructeur
	 * 
	 * @param id
	 * @param nom
	 * @param prenom
	 * @param lEmpruntsClient
	 */
	public ClientA(int id, String nom, String prenom, List<Emprunt> lEmpruntsClient) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.lEmpruntsClient = lEmpruntsClient;
	}

	/**
	 * Getter
	 * 
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Setter
	 * 
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Getter
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 * 
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Getter
	 * 
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * Setter
	 * 
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * Getter
	 * 
	 * @return the lEmpruntsClient
	 */
	public List<Emprunt> getlEmpruntsClient() {
		return lEmpruntsClient;
	}

	/**
	 * Setter
	 * 
	 * @param lEmpruntsClient the lEmpruntsClient to set
	 */
	public void setlEmpruntsClient(List<Emprunt> lEmpruntsClient) {
		this.lEmpruntsClient = lEmpruntsClient;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", nom=" + nom + ", prenom=" + prenom+"]";
	}

}
