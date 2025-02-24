package fr.usmb.vpub;

import java.util.ArrayList;

/**
 * @author Pierre Le Fameux
 *
 */
public class Cocktail {
	
	private static class Ingredient{
		private String name;
		private Double quantite;
		
		public Ingredient(String name, Double quantite){
			this.name = name;
			this.quantite = quantite;
		}

		public String getName(){
			return name;
		}

		public Double getQuantite(){
			return quantite;
		}

		public void setQuantite(Double quantite){
			this.quantite = quantite;
		}

		public void setIngredient(String name){
			this.name = name;
		}
	}
	
	private String nom;
	private ArrayList<Ingredient> ingredients;
	private Boolean alcoolise;
	
	/**
	 * Creates a Cocktail with its name
	 * @param nom
	 */
	public Cocktail(String nom){
		this.nom = nom;
		this.ingredients = new ArrayList();
		this.alcoolise = false;
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

	public ArrayList<Ingredient> getIngrediants(){
		return ingredients;
	}

	public void setIngredients(ArrayList<Ingredient> ingredients){
		this.ingredients = ingredients;
	}

	public Boolean getAlcoolise(){
		return alcoolise;
	}

	public void setAlcoolise(Boolean alcoolise){
		this.alcoolise = alcoolise;
	}

	/**
	 * add a new element into the Cocktail.
	 * @param ingredient
	 * @param quantite
	 */
	public void add(String ingredient, Double quantite){
		this.ingredients.add(new Ingredient(ingredient, quantite));
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		String retour;
		StringBuilder bld = new StringBuilder();
		int i = 0;
		while (i<this.ingredients.size()) {
			bld.append(this.ingredients.get(i).getName() + " " + this.ingredients.get(i).getQuantite() + "%" + "\t");
			i++;
		}

		retour = bld.toString();
		return retour;
	}

}
