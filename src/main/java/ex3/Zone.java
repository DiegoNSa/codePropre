package ex3;

import java.util.ArrayList;
import java.util.List;

public abstract class Zone {

	private List<String> types;
	private List<String> noms;
	private List<String> comportements;
	
	/** Constructeur de la classe zone
	 * 
	 * 
	 */
	public Zone(){
		types = new ArrayList<String>();
		noms = new ArrayList<String>();
		comportements = new ArrayList<String>();
	}
	
	
	/** Ajoute un animal a la zone
	 * 
	 * @param typeAnimal : le type de l'animal a ajouter
	 * @param nomAnimal : le nom de l'animal a ajouter
	 * @param comportement : le comportement alimentaire de l'animal a ajouter 
	 */
	public void addAnimal(String typeAnimal, String nomAnimal, String comportement) {
		types.add(typeAnimal);
		noms.add(nomAnimal);
		comportements.add(comportement);
	}
	
	/**
	 * Affiche en console la liste des animaux de la zone
	 */
	public void afficherListeAnimaux(){
		for (String nom: noms){
			System.out.println(nom);
		}
	}
	
	/** Compte le nombre d'animaux dans la zone
	 * 
	 * @return int : le nombre d'animaux dans la zone
	 */
	public int compterAnimaux(){
		return noms.size();
	}
	
	/** Retourne le poids en kilo de nourriture necessaire pour les animaux de la zone
	 * 
	 * @return double poids : le poids en kilo de nourriture
	 */
	public abstract double getPoids();
	
	/** Calcule le poids en kilo necessaire pour nourrir tous les animaux de la zone chaque jour
	 * 
	 * @return double poids : le poids en kilo de nourriture pour nourrir tous les animaux de la zone chaque jour
	 */
	public double calculerKgsNourritureParJour(){
		return noms.size() * getPoids();
	}
}
