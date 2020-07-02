/**
 * 
 */
package jpa.entites;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author robin
 *
 */
@Entity
@Table(name = "EMPRUNT")
public class Emprunt {

	/** id id */
	@Id
	@Column(name = "ID")
	private int id;

	/** dateDebut date de début de l'emprunt */
	@Column(name = "DATE_DEBUT")
	private LocalDate dateDebut;

	/** dateFin date de fin de l'emprunt */
	@Column(name = "DATE_FIN")
	private LocalDate dateFin;

	/** delai delai */
	@Column(name = "DELAI")
	private int delai;

	/** idClient id du client qui a emprunté le livre */
	@ManyToOne
	@JoinColumn(name = "ID_CLIENT")
	private Client client;

	/** lLivres liste des livres emprunté par le client */
	@ManyToMany(mappedBy = "lEmprunts")
	List<Livre> lLivres;

	/**
	 * Constructeur
	 * 
	 */
	public Emprunt() {
		super();
		lLivres = new ArrayList<>();
	}

	/**
	 * Constructeur
	 * 
	 * @param id
	 * @param dateDebut
	 * @param dateFin
	 * @param delai
	 * @param idClient
	 */
	public Emprunt(int id, LocalDate dateDebut, LocalDate dateFin, int delai, Client client) {
		super();
		this.id = id;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.delai = delai;
		this.client = client;
		lLivres = new ArrayList<>();
	}

	/**
	 * Constructeur
	 * 
	 * @param id
	 * @param dateDebut
	 * @param dateFin
	 * @param delai
	 * @param idClient
	 * @param lLivres
	 */
	public Emprunt(int id, LocalDate dateDebut, LocalDate dateFin, int delai, Client client, List<Livre> lLivres) {
		super();
		this.id = id;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.delai = delai;
		this.client = client;
		this.lLivres = lLivres;
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
	 * @return the dateDebut
	 */
	public LocalDate getDateDebut() {
		return dateDebut;
	}

	/**
	 * Setter
	 * 
	 * @param dateDebut the dateDebut to set
	 */
	public void setDateDebut(LocalDate dateDebut) {
		this.dateDebut = dateDebut;
	}

	/**
	 * Getter
	 * 
	 * @return the dateFin
	 */
	public LocalDate getDateFin() {
		return dateFin;
	}

	/**
	 * Setter
	 * 
	 * @param dateFin the dateFin to set
	 */
	public void setDateFin(LocalDate dateFin) {
		this.dateFin = dateFin;
	}

	/**
	 * Getter
	 * 
	 * @return the delai
	 */
	public int getDelai() {
		return delai;
	}

	/**
	 * Setter
	 * 
	 * @param delai the delai to set
	 */
	public void setDelai(int delai) {
		this.delai = delai;
	}

	/**
	 * Getter
	 * 
	 * @return the idClient
	 */
	public Client getIdClient() {
		return client;
	}

	/**
	 * Setter
	 * 
	 * @param idClient the idClient to set
	 */
	public void setIdClient(Client client) {
		this.client = client;
	}

	/**
	 * Getter
	 * 
	 * @return the lLivres
	 */
	public List<Livre> getlLivres() {
		return lLivres;
	}

	/**
	 * Setter
	 * 
	 * @param lLivres the lLivres to set
	 */
	public void setlLivres(List<Livre> lLivres) {
		this.lLivres = lLivres;
	}

	@Override
	public String toString() {
		return "Emprunt [id=" + id + ", dateDebut=" + dateDebut + ", dateFin=" + dateFin + ", delai=" + delai
				+ ", client=" + client+"]";
	}

}
