package ex3;

import java.util.List;

public class Aquarium extends Zone {

	/** 
	 * Masse moyenne en kg de nourriture consommée par 1 poisson
	 */
	private static final double MASSE_NOURRITURE = 0.2;

	/** Retourne le poids en kilo de nourriture necessaire nourrir un animal de la zone aquarium
	 * 
	 * @return double masse : Masse moyenne en kg de nourriture consommée par 1 poisson
	 */
	@Override
	public double getPoids() {
		return MASSE_NOURRITURE;
	}

}
