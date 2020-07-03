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
public class Virement extends Operation {
	private String beneficiaire;

	public Virement() {
		super();
	}

	/**
	 * Getter
	 * @return the beneficiaire
	 */
	public String getBeneficiaire() {
		return beneficiaire;
	}

	/**
	 * Setter
	 * @param beneficiaire the beneficiaire to set
	 */
	public void setBeneficiaire(String beneficiaire) {
		this.beneficiaire = beneficiaire;
	}
	
}
