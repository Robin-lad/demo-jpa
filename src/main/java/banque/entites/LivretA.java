/**
 * 
 */
package banque.entites;

import javax.persistence.Entity;

/**
 * @author robin
 *
 */
@Entity
public class LivretA extends Compte {

	private double taux;
	
	/** Constructeur
	 * 
	 */
	public LivretA() {
	}

	/**
	 * Getter
	 * @return the taux
	 */
	public double getTaux() {
		return taux;
	}

	/**
	 * Setter
	 * @param taux the taux to set
	 */
	public void setTaux(double taux) {
		this.taux = taux;
	}

}
