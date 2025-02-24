package fr.usmb.vpub;

/**
 * @author Pierre Le Fameux
 *
 */
public class Boisson {
	private String nom;
	private Boolean alcoolise;
	private Float degre;
	private Float volume; // volume de la bouteille, cennette, fut ...
	private Float prix;
	
	/**
	 * @param nom
	 */
	public Boisson(String nom){
		this.nom = nom;
		this.alcoolise = false;
	}
	
	/**
	 * @param nom
	 * @param degre
	 */
	public Boisson(String nom, Float degre) {
		if (degre < 0) {
			throw new IllegalArgumentException("Le degré d'alcool ne peut pas être négatif.");
		}

		this.nom = nom;
		this.degre = degre;
		this.alcoolise = (degre > 0);
	}

	/**
	 * Getter et setter
	 */
	public String getNom(){
		return nom;
	}

	public void setNom(String nom){
		this.nom = nom;
	}

	public Boolean getAlcoolise() {
		return alcoolise;
	}

	public void setAlcoolise(Boolean alcoolise) {
		this.alcoolise = alcoolise;
	}

	public Float getDegre() {
		return degre;
	}

	public void setDegre(Float degre) {
		this.degre = degre;
	}

	public Float getVolume() {
		return volume;
	}

	public void setVolume(Float volume) {
		this.volume = volume;
	}

	public Float getPrix() {
		return prix;
	}

	public void setPrix(Float prix) {
		this.prix = prix;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		String retour = this.nom;
		if(Boolean.TRUE.equals(this.alcoolise)){
			return retour + " (l'abus d'alcool est dangereux pour la sante)";
		}else{
			return retour;
		}
	}
}
