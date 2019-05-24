package ex2;

/** Représente un compte bancaire de type compte courante (type=CC) ou livret A (type=LA)
 * @author DIGINAMIC
 */
public class CompteBancaire {

	/** solde : solde du compte */
	protected double solde;
	
	/** decouvert : un découvert est autorisé seulement pour les comptes courants */
	protected double decouvert;
	
	/** Le type vaut soit CC=Compte courant, ou soit LA=Livret A */
	protected TypeCompte type;
	
	/** Constructeur du compte courant
	 * @param solde
	 * @param decouvert
	 * @param type
	 */
	public CompteBancaire(String type, double solde, double decouvert) {
		super();
		this.solde = solde;
		this.decouvert = decouvert;
		this.type = TypeCompte.CompteCourant;
	}
	
	/** Ajoute un montant au solde
	 * @param montant
	 */
	public void ajouterMontant(double montant){
		this.solde += montant;
	}
	
	/** debite un montant au solde
	 * @param montant
	 */
	public void debiterMontant(double montant){
		if (this.solde - montant > decouvert){
				this.solde = solde - montant;
		}
	}
	
	/** Getter pour le solde
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}
	
	/** Setter pour le decouvert
	 * @param solde la nouvelle valeur du solde
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}
	/** Getter pour le decouvert
	 * @return la valeur du decouvert
	 */
	public double getDecouvert() {
		return decouvert;
	}
	/** Setter pour le decouvert
	 * @param decouvert la nouvelle valeur de decouvert
	 */
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}
	
	/** Getter pour le type de compte
	 * @return le nouveau type de compte
	 */
	public TypeCompte getType() {
		return type;
	}
	/** Setter pour le type
	 * @param type the type to set
	 */
	public void setType(TypeCompte type) {
		this.type = type;
	}
}
