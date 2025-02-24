package fr.usmb.vpub;

import java.util.ArrayList;
/**
 * @author Pierre Le Fameux
 *
 */
public class Cave {
	private ArrayList<Boisson> rayons;
	
	/**
	 * 
	 */
	public Cave(){
		this.rayons = new ArrayList<Boisson>();
	}

	public ArrayList<Boisson> getRayons() {
		return rayons;
	}

	public void setRayons(ArrayList<Boisson> rayons) {
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
		Boisson retour = null;
		int i = 0;
		while (i< rayons.size() && retour == null){
			if (rayons.get(i).getNom().equals(nom)){
				retour = rayons.get(i);
				this.rayons.remove(retour);
			}
			i++;
		}
		return retour;
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
		retour = retour + bld.toString();
		return retour;
	}
}
