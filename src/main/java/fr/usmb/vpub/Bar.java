package fr.usmb.vpub;
import java.util.ArrayList;
import java.util.Vector;
import java.util.Enumeration;

/**
 * @author Pierre Le Fameux
 *
 */
public class Bar {
	private ArrayList<Boisson> boissonChaude;
	private ArrayList<Boisson> boissonFroide;
	private ArrayList<Boisson> boissonAlcoolisee;
	private ArrayList<Cocktail> cocktailSansAlcoole;
	private ArrayList<Cocktail> cocktailAvecAlcoole;
	
	/**
	 * 
	 */
	public Bar(){
		this.boissonChaude = new ArrayList<Boisson>();
		this.boissonFroide = new ArrayList<Boisson>();
		this.boissonAlcoolisee = new ArrayList<Boisson>();
		
		this.cocktailAvecAlcoole = new ArrayList<Cocktail>();
		this.cocktailSansAlcoole = new ArrayList<Cocktail>();
	}

	public ArrayList<Boisson> getBoissonChaude() {
		return boissonChaude;
	}

	public void setBoissonChaude(ArrayList<Boisson> boissonChaude) {
		this.boissonChaude = boissonChaude;
	}

	public ArrayList<Boisson> getBoissonFroide() {
		return boissonFroide;
	}

	public void setBoissonFroide(ArrayList<Boisson> boissonFroide) {
		this.boissonFroide = boissonFroide;
	}

	public ArrayList<Boisson> getBoissonAlcoolisee() {
		return boissonAlcoolisee;
	}

	public void setBoissonAlcoolisee(ArrayList<Boisson> boissonAlcoolisee) {
		this.boissonAlcoolisee = boissonAlcoolisee;
	}

	public ArrayList<Cocktail> getCocktailSansAlcoole() {
		return cocktailSansAlcoole;
	}

	public void setCocktailSansAlcoole(ArrayList<Cocktail> cocktailSansAlcoole) {
		this.cocktailSansAlcoole = cocktailSansAlcoole;
	}

	public ArrayList<Cocktail> getCocktailAvecAlcoole() {
		return cocktailAvecAlcoole;
	}

	public void setCocktailAvecAlcoole(ArrayList<Cocktail> cocktailAvecAlcoole) {
		this.cocktailAvecAlcoole = cocktailAvecAlcoole;
	}

	/**
	 * @param boisson
	 */
	public void add(Boisson boisson){
		if(boisson.getAlcoolise() == true){
			this.boissonAlcoolisee.add(boisson);
		}else{
			this.boissonFroide.add(boisson);
		}
	}
	
	/**
	 * @param cocktail
	 */
	public void add(Cocktail cocktail){
		if(cocktail.getAlcoolise() == false){
			this.cocktailSansAlcoole.add(cocktail);
		}else{
			this.cocktailAvecAlcoole.add(cocktail);
		}
	}
	
	/**
	 * @param command
	 * @return
	 */
	public Object serv(String command){

		for (Boisson b : this.boissonChaude) {
			if (b.getNom().equals(command)) {
				this.boissonChaude.remove(b);
				return b;
			}
		}

		for (Boisson b : this.boissonFroide) {
			if (b.getNom().equals(command)) {
				this.boissonFroide.remove(b);
				return b;
			}
		}

		for (Cocktail c : this.cocktailSansAlcoole) {
			if (c.getNom().equals(command)) {
				this.cocktailSansAlcoole.remove(c);
				return c;
			}
		}

		for (Cocktail c : this.cocktailAvecAlcoole) {
			if (c.getNom().equals(command)) {
				this.cocktailAvecAlcoole.remove(c);
				return c;
			}
		}

		return null;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		StringBuilder retour = new StringBuilder();
		String eol = System.lineSeparator();

		retour.append("Bar : ").append(eol);

		retour.append("\t Sans alcool").append(eol);
		for (Boisson b : this.boissonFroide) {
			retour.append("\t\t").append(b.toString()).append(eol);
		}

		retour.append("\t Avec alcool").append(eol);
		for (Boisson b : this.boissonAlcoolisee) {
			retour.append("\t\t").append(b.toString()).append(eol);
		}

		retour.append("\t Cocktail sans alcool").append(eol);
		for (Cocktail c : this.cocktailSansAlcoole) {
			retour.append("\t\t").append(c.toString()).append(eol);
		}

		retour.append("\t Cocktail avec alcool").append(eol);
		for (Cocktail c : this.cocktailAvecAlcoole) {
			retour.append("\t\t").append(c.toString()).append(eol);
		}

		retour.append("\t Boissons chaudes").append(eol);
		for (Boisson b : this.boissonChaude) {
			retour.append("\t\t").append(b.toString()).append(eol);
		}

		return retour.toString();
	}

}
