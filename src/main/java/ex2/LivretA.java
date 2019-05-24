package ex2;

public class LivretA extends CompteBancaire {

	/** tauxRemuneration : taux de rémunération du livret A */
	private double tauxRemuneration;

	/** Constructeur du livret A
	 * @param solde
	 * @param decouvert
	 * @param type
	 */
	public LivretA(String type, double solde, double tauxRemuneration) {
		super(type, solde, 0);
		this.tauxRemuneration = tauxRemuneration;
		this.type = TypeCompte.LivretA;
	}

	/** Ajoute un montant au solde lors de la remuneration annuelle
	 * @param montant : montant a debiter
	 */
	public void appliquerRemuAnnuelle() {
		this.solde = solde + solde * tauxRemuneration / 100;
	}

	/** debite un montant au solde si le compte ne passe pas en decouvert
	 * @param montant : montant a debiter
	 */
	public void debiterMontant(double montant) {
		if (this.solde - montant > 0) {
			this.solde = solde - montant;
		}
	}

	/** Getter pour tauxRemuneration 
	 * @return la valeur de tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}
	/** Setter pour tauxRemuneration
	 * @param tauxRemuneration : la nouvelle valeur du taux de rémunération 
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

}
