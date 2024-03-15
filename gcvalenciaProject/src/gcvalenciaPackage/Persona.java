package gcvalenciaPackage;

/**
 *  @author Gian Carlo Valencia
 */
public class Persona {
	/**
	 * attribute name in string and attribute age in integer.
	 */
	private String nom;
	private int edat;
	
	/**
	 * 
	 * A constructor method.
	 * @param nom 1st parameter
	 * @param edat 2nd parameter
	 */
	public Persona(String nom, int edat) {
		this.nom = nom;
		this.edat = edat;
	}
	/**
	 * 
	 * @return getter method that returns the value of the attribute nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * 
	 * @param nom setter method that sets the value of the nom attribute
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	
}

