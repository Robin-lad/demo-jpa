/**
 * 
 */
package banque.entites;

import java.time.LocalDateTime;

/**
 * @author robin
 *
 */
public class Operation {
	private LocalDateTime date;
	private double montant;
	private String motif;
	
	public Operation() {
		super();
	}
	public Operation(LocalDateTime date, double montant, String motif) {
		super();
		this.date = date;
		this.montant = montant;
		this.motif = motif;
	}
	/**
	 * Getter
	 * @return the date
	 */
	public LocalDateTime getDate() {
		return date;
	}
	/**
	 * Setter
	 * @param date the date to set
	 */
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	/**
	 * Getter
	 * @return the montant
	 */
	public double getMontant() {
		return montant;
	}
	/**
	 * Setter
	 * @param montant the montant to set
	 */
	public void setMontant(double montant) {
		this.montant = montant;
	}
	/**
	 * Getter
	 * @return the motif
	 */
	public String getMotif() {
		return motif;
	}
	/**
	 * Setter
	 * @param motif the motif to set
	 */
	public void setMotif(String motif) {
		this.motif = motif;
	}
	
	
}
