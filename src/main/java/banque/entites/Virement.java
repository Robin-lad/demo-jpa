/**
 * 
 */
package banque.entites;

import java.time.LocalDateTime;

/**
 * @author robin
 *
 */
public class Virement extends Operation {
	private String beneficiaire;

	public Virement() {
		super();
	}

	public Virement(LocalDateTime date, double montant, String motif, String beneficiaire) {
		super(date, montant, motif);
		this.beneficiaire = beneficiaire;
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
