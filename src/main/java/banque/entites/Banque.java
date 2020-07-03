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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author robin
 *
 */
@Entity
@Table(name="BANQUE")
public class Banque {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;
	
	@Column(name = "NOM")
	private String nom;
	
	@OneToMany(mappedBy = "banque")
	private List<Client> lClient;

	public Banque() {
		super();
		lClient = new ArrayList<>();
	}

	public Banque(String nom) {
		super();
		this.nom = nom;
		lClient = new ArrayList<>();
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

	/**
	 * Getter
	 * @return the lclient
	 */
	public List<Client> getLclient() {
		return lClient;
	}

	/**
	 * Setter
	 * @param lclient the lclient to set
	 */
	public void setLclient(List<Client> lClient) {
		this.lClient = lClient;
	}
	
	public void addClient(Client c) {
		this.lClient.add(c);
	}
	
}
