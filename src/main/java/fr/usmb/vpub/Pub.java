package fr.usmb.vpub;

import java.util.logging.Logger;

/**
 * Virtual PUB
 */
public class Pub {

	private Bar bar;
	private Cave cave;
	
	/**
	 * 
	 */
	public Pub(){
		this.bar = new Bar();
		this.cave = new Cave();
	}
	
	public void approvisionnerBar(String nom){
		this.bar.add(this.cave.take(nom));
	}


	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/* Creation du pub */
		Pub pub = new Pub();

		Boisson coca = new Boisson("Coca");
		Boisson eau = new Boisson("Eau");
		Boisson sky = new Boisson("Whisky", 40F);
		Boisson bierre = new Boisson("Bierre", 8F);
		
		pub.cave.add(coca);
		pub.cave.add(coca);
		pub.cave.add(coca);
		pub.cave.add(sky);
		pub.cave.add(sky);
		pub.cave.add(bierre);
		pub.cave.add(bierre);
		pub.cave.add(eau);

		System.out.println("Cave initiale :");
		System.out.println(pub.cave);

		pub.approvisionnerBar("bierre");
		pub.approvisionnerBar("Whisky");
		pub.approvisionnerBar("Coca");
		pub.approvisionnerBar("eau");
		
		Cocktail maz = new Cocktail("Mazout");
		maz.add("bierre", 50D);
		maz.add("coca", 50D);
		pub.bar.add(maz);
		
		Boisson cafe = new Boisson("cafe");
		pub.bar.getBoissonChaude().add(cafe);

		System.out.println(pub.cave);
		System.out.println(pub.bar);

		System.out.println("Boisson servie : " + pub.bar.serv("cafe"));
		System.out.println(pub.bar);
	}

}
