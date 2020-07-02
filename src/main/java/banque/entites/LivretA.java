/**
 * 
 */
package banque.entites;

/**
 * @author robin
 *
 */
public class LivretA extends Compte {

	private double taux;
	
	/** Constructeur
	 * 
	 */
	public LivretA() {
	}

	/** Constructeur
	 * @param numero
	 * @param solde
	 */
	public LivretA(int numero, double solde, double taux) {
		super(numero, solde);
		this.taux=taux;
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
