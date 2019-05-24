package ex2;

public enum TypeCompte {
	CompteCourant("CC"),
	LivretA("LA");
	
	public String description;
	private TypeCompte(String name) {
		this.description = name;
	}

}
