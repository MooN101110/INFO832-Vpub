package fr.usmb.vpub;

import java.util.ArrayList;
import java.util.List;
/**
 * @author Pierre Le Fameux
 *
 */
public class Cave {
	private List<Boisson> rayons;
	
	/**
	 * 
	 */
	public Cave(){
		this.rayons = new ArrayList<>();
	}

	public List<Boisson> getRayons() {
		return rayons;
	}

	public void setRayons(List<Boisson> rayons) {
		this.rayons = rayons;
	}

	/**
	 * @param b
	 */
	public void add(Boisson b){
		this.rayons.add(b);
	}
	
	/**
	 * @param nom
	 * @return
	 */
	public Boisson take(String nom){
		for (Boisson boisson : new ArrayList<>(rayons)) { // Copie temporaire pour éviter ConcurrentModificationException
			if (boisson.getNom().equalsIgnoreCase(nom)) {
				rayons.remove(boisson);
				return boisson;
			}
		}
		return null;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		String retour = "Cave: \n";
		StringBuilder bld = new StringBuilder();
		String eol = System.getProperty("line.separator");
		int i = 0;
		while (i<rayons.size()) {
			bld.append("\t" + rayons.get(i).toString() + eol);
			i++;
		}
		retour = retour + bld;
		return retour;
	}
}
