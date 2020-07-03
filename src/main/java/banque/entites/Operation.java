/**
 * 
 */
package banque.entites;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author robin
 *
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name="OPERATION")
public class Operation {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;
	
	@Column(name="DATE")
	private LocalDateTime date;
	
	@Column(name="MONTANT")
	private double montant;
	
	@Column(name="MOTIF")
	private String motif;
	
	@ManyToOne
	@JoinColumn(name ="ID_COMPTE")
	private Compte compte;
	
	public Operation() {
		super();
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

	/**
	 * Getter
	 * @return the compte
	 */
	public Compte getCompte() {
		return compte;
	}

	/**
	 * Setter
	 * @param compte the compte to set
	 */
	public void setCompte(Compte compte) {
		this.compte = compte;
	}
	
	
}
