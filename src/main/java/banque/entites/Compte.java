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
@Table(name="COMPTE")
public class Compte {
	
	@Column(name="NUMERO")
	private int numero;
	
	@Column(name="SOLDE")
	private double solde;
	
	public Compte() {
		super();
	}
	
	public Compte(int numero, double solde) {
		super();
		this.numero = numero;
		this.solde = solde;
	}
	/**
	 * Getter
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}
	/**
	 * Setter
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}
	/**
	 * Getter
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}
	/**
	 * Setter
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}
}
