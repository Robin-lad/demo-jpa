/**
 * 
 */
package banque.entites;

/**
 * @author robin
 *
 */
public class Banque {
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
