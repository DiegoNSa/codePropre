package ex4;

import java.util.Date;

public class Pret {

	/**
	 * Strategie a appliquer pour le pret
	 */
	private Strategy strategy;
	/**
	 * Valeur total du prêt
	 */
	private double capital;
	/**
	 * Valeur du prêt restant a rembourser
	 */
	private double capitalRestantDu;
	/**
	 * taux de remboursement du prêt
	 */
	private double taux;
	/**
	 * Date du debut de remboursement du pret
	 */
	private Date dateDebut;
	/**
	 * Date de fin de remboursement du pret
	 */
	private Date dateFin;
	
	/** Constructeur de pret avec un capital, un taux de remboursemment et une date de debut
	 * <p> il n'y a pas de date de fin limite
	 * 
	 * @param capital : valeur du prêt
	 * @param taux : taux d'interet du prêt
	 * @param dateDebut : date de debut du prêt
	 */
	public Pret(double capital, double taux, Date dateDebut) {
		super();
		this.strategy = new PretATerme();
		this.capital = capital;
		this.taux = taux;
		this.dateDebut = dateDebut;
	}
	
	/** Constructeur de pret avec un capital, un taux de remboursemment et une date de debut et de fin
	 * 
	 * @param capital : valeur du prêt
	 * @param taux : taux d'interet du prêt
	 * @param dateDebut : date de debut du prêt
	 * @param dateFin : date de fin du pret
	 */
	public Pret(double capital, double taux, Date dateDebut, Date dateFin) {
		this(capital,taux,dateDebut);
		this.dateFin = dateFin;
	}
	
	/** Constructeur de pret avec un capital, un taux de remboursemment et une date de debut et de fin
	 * 
	 * @param capital : valeur du prêt
	 * @param capitalRestantDu : valeur du prêt restante
	 * @param taux : taux d'interet du prêt
	 * @param dateDebut : date de debut du prêt
	 * @param dateFin : date de fin du pret
	 */
	public Pret(double capital, double capitalRestantDu, double taux, Date dateDebut, Date dateFin) {
		this(capital,taux,dateDebut,dateFin);
		this.capitalRestantDu = capitalRestantDu;
	}

	/** Getter for strategy
	 * @return the strategy
	 */
	public Strategy getStrategy() {
		return strategy;
	}

	/** Setter
	 * @param strategy the strategy to set
	 */
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	/** Getter for capital
	 * @return the capital
	 */
	public double getCapital() {
		return capital;
	}

	/** Setter
	 * @param capital the capital to set
	 */
	public void setCapital(double capital) {
		this.capital = capital;
	}

	/** Getter for capitalRestantDu
	 * @return the capitalRestantDu
	 */
	public double getCapitalRestantDu() {
		return capitalRestantDu;
	}

	/** Setter
	 * @param capitalRestantDu the capitalRestantDu to set
	 */
	public void setCapitalRestantDu(double capitalRestantDu) {
		this.capitalRestantDu = capitalRestantDu;
	}

	/** Getter for taux
	 * @return the taux
	 */
	public double getTaux() {
		return taux;
	}

	/** Setter
	 * @param taux the taux to set
	 */
	public void setTaux(double taux) {
		this.taux = taux;
	}

	/** Getter for dateDebut
	 * @return the dateDebut
	 */
	public Date getDateDebut() {
		return dateDebut;
	}

	/** Setter
	 * @param dateDebut the dateDebut to set
	 */
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	/** Getter for dateFin
	 * @return the dateFin
	 */
	public Date getDateFin() {
		return dateFin;
	}

	/** Setter
	 * @param dateFin the dateFin to set
	 */
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	
}
