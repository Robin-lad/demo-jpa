/**
 * 
 */
package banque.entites;

import java.time.LocalDate;

/**
 * @author robin
 *
 */
public class AssuranceVie extends Compte {
	
	private LocalDate dateFin;
	private double taux;

	/** Constructeur
	 * 
	 */
	public AssuranceVie() {
		// TODO Auto-generated constructor stub
	}

	/** Constructeur
	 * @param numero
	 * @param solde
	 */
	public AssuranceVie(int numero, double solde, LocalDate dateFin, double taux) {
		super(numero, solde);
		this.dateFin=dateFin;
		this.taux=taux;
	}

	/**
	 * Getter
	 * @return the dateFin
	 */
	public LocalDate getDateFin() {
		return dateFin;
	}

	/**
	 * Setter
	 * @param dateFin the dateFin to set
	 */
	public void setDateFin(LocalDate dateFin) {
		this.dateFin = dateFin;
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
