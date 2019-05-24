package ex3;

/**
 * @author DIGINAMIC
 */
public class Zoo {

	/**
	 * nom du zoo
	 */
	private String nom;
	
	/**
	 * Zone du zoo ou sont placé les animaux de savane 
	 */
	private SavaneAfricaine savaneAfricaine;
	/**
	 * Zone du zoo ou sont placé les animaux carnivore 
	 */
	private ZoneCarnivore zoneCarnivore;
	public SavaneAfricaine getSavaneAfricaine() {
		return savaneAfricaine;
	}


	/**
	 * Zone du zoo ou sont placé les reptiles 
	 */
	private FermeReptile fermeReptile;
	/**
	 * Zone du zoo ou sont placé les animaux vivants en aquarium 
	 */
	private Aquarium aquarium;
	
	/** Contructeur pour la classe Zoo
	 * 
	 * @param nom : nom donné au zoo
	 */
	public Zoo(String nom){
		this.nom = nom;
		savaneAfricaine = new SavaneAfricaine();
		zoneCarnivore = new ZoneCarnivore();
		fermeReptile = new FermeReptile();
		aquarium = new Aquarium();

	}
	
	/** Ajoute un animal dans l'une des zones du zoo selon son type et son comportement allimentaire
	 * <p> un mammifere carnivore sera placé dans la zone carnivore ZoneCarnivore
	 * <p> un mammifere herbivore sera placé dans la zone savane SavaneAfricaine
	 * <p> un reptile sera placé dans la ferme de reptile FermeReptile
	 * <p> un poisson sera placé dans la zone aquarium Aquarium
	 * 
	 * @param nomAnimal
	 * @param typeAnimal
	 * @param comportement
	 */
	public void addAnimal(String nomAnimal, String typeAnimal, String comportement){
		if (typeAnimal.equals("MAMMIFERE") && comportement.equals("CARNIVORE")){
			zoneCarnivore.addAnimal(typeAnimal, nomAnimal, comportement);
		}
		else if (typeAnimal.equals("MAMMIFERE") && comportement.equals("HERBIVORE")){
			savaneAfricaine.addAnimal(typeAnimal, nomAnimal, comportement);
		}
		else if (typeAnimal.equals("REPTILE")){
			fermeReptile.addAnimal(typeAnimal, nomAnimal, comportement);
		}
		else if (typeAnimal.equals("POISSON")){
			aquarium.addAnimal(typeAnimal, nomAnimal, comportement);
		}
	}
	
	/**
	 * Affiche la liste de tous les animaux du zoo
	 */
	public void afficherListeAnimaux(){
		savaneAfricaine.afficherListeAnimaux();
		zoneCarnivore.afficherListeAnimaux();
		fermeReptile.afficherListeAnimaux();
		aquarium.afficherListeAnimaux();
	}

	/** Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	

	public void setSavaneAfricaine(SavaneAfricaine savaneAfricaine) {
		this.savaneAfricaine = savaneAfricaine;
	}

	public ZoneCarnivore getZoneCarnivore() {
		return zoneCarnivore;
	}

	public void setZoneCarnivore(ZoneCarnivore zoneCarnivore) {
		this.zoneCarnivore = zoneCarnivore;
	}

	public FermeReptile getFermeReptile() {
		return fermeReptile;
	}

	public void setFermeReptile(FermeReptile fermeReptile) {
		this.fermeReptile = fermeReptile;
	}

	public Aquarium getAquarium() {
		return aquarium;
	}

	public void setAquarium(Aquarium aquarium) {
		this.aquarium = aquarium;
	}
}
