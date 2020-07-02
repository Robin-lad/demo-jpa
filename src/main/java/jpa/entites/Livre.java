/**
 * 
 */
package jpa.entites;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * @author robin
 *
 */
@Entity
@Table(name = "LIVRE")
public class Livre {

	/** id id */
	@Id
	@Column(name = "ID")
	private int id;

	/** titre titre du livre */
	@Column(name = "TITRE")
	private String titre;

	/** auteur auteur du livre */
	@Column(name = "AUTEUR")
	private String auteur;

	/** lEmprunts liste des emprunts comportant ce livre */
	@ManyToMany
	@JoinTable(name = "COMPO",

			joinColumns = @JoinColumn(name = "ID_LIV", referencedColumnName = "ID"), inverseJoinColumns = @JoinColumn(name = "ID_EMP", referencedColumnName = "ID"))

	List<Emprunt> lEmprunts;

	/**
	 * Constructeur
	 * 
	 */
	public Livre() {
		super();
		lEmprunts = new ArrayList<>();
	}

	/**
	 * Constructeur
	 * 
	 * @param id
	 * @param titre
	 * @param auteur
	 */
	public Livre(int id, String titre, String auteur) {
		super();
		this.id = id;
		this.titre = titre;
		this.auteur = auteur;
		lEmprunts = new ArrayList<>();
	}

	/**
	 * Constructeur
	 * 
	 * @param id
	 * @param titre
	 * @param auteur
	 * @param lEmprunts
	 */
	public Livre(int id, String titre, String auteur, List<Emprunt> lEmprunts) {
		super();
		this.id = id;
		this.titre = titre;
		this.auteur = auteur;
		this.lEmprunts = lEmprunts;
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
	 * @return the titre
	 */
	public String getTitre() {
		return titre;
	}

	/**
	 * Setter
	 * 
	 * @param titre the titre to set
	 */
	public void setTitre(String titre) {
		this.titre = titre;
	}

	/**
	 * Getter
	 * 
	 * @return the auteur
	 */
	public String getAuteur() {
		return auteur;
	}

	/**
	 * Setter
	 * 
	 * @param auteur the auteur to set
	 */
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	/**
	 * Getter
	 * 
	 * @return the lEmprunts
	 */
	public List<Emprunt> getlEmprunts() {
		return lEmprunts;
	}

	/**
	 * Setter
	 * 
	 * @param lEmprunts the lEmprunts to set
	 */
	public void setlEmprunts(List<Emprunt> lEmprunts) {
		this.lEmprunts = lEmprunts;
	}

	@Override
	public String toString() {
		return "Livre [id=" + id + ", titre=" + titre + ", auteur=" + auteur+"]";
	}

}
