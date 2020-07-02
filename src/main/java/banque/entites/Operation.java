/**
 * 
 */
package banque.entites;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author robin
 *
 */
@Entity
@Table(name="OPERATION")
public class Operation {
	
	@Column(name="DATE")
	private LocalDateTime date;
	
	@Column(name="MONTANT")
	private double montant;
	
	@Column(name="MOTIF")
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
