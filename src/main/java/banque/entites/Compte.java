/**
 * 
 */
package banque.entites;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author robin
 *
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "COMPTE")
public class Compte {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	@Column(name = "NUMERO")
	private int numero;

	@Column(name = "SOLDE")
	private double solde;

	@ManyToMany
	@JoinTable(name = "Comptes_Clients",

			joinColumns = @JoinColumn(name = "ID_CPT", referencedColumnName =

			"ID"), inverseJoinColumns = @JoinColumn(name = "ID_CLI", referencedColumnName =

			"ID"))
	private List<Client> lClient;

	@OneToMany(mappedBy = "compte")
	private List<Operation> lOperation;

	public Compte() {
		super();
		lClient = new ArrayList<>();
		lOperation = new ArrayList<>();
	}

	/**
	 * Getter
	 * 
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * Setter
	 * 
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * Getter
	 * 
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}

	/**
	 * Setter
	 * 
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}

	public void addClient(Client c) {
		this.lClient.add(c);
	}

	public void addOperation(Operation o) {
		this.lOperation.add(o);
		this.solde+=o.getMontant();
	}
}
