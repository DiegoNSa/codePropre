package ex3;

import java.util.List;

public class ZoneCarnivore extends Zone {
	/** 
	 * Masse moyenne en kg de nourriture consommée par 1 carnivore
	 */
	private static final double MASSE_NOURRITURE = 10;

	/** Retourne le poids en kilo de nourriture necessaire nourrir un animal de la zone carnivore
	 * 
	 * @return double masse : Masse moyenne en kg de nourriture consommée par 1 carnivore
	 */
	@Override
	public double getPoids() {
		return MASSE_NOURRITURE;
	}
}
