/**
 * 
 */
package banque.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author robin
 *
 */
@Entity
@Table(name="BANQUE")
public class Banque {
	
	@Column(name = "NOM")
	private String nom;

	public Banque() {
		super();
	}

	public Banque(String nom) {
		super();
		this.nom = nom;
	}

	/**
	 * Getter
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
}
