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

		Logger logger = Logger.getLogger(Pub.class.getName());

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
		
		logger.info("Cave initiale :");
		logger.info(pub.cave.toString());

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
		
		logger.info(pub.cave.toString());
		logger.info(pub.bar.toString());
		
		logger.info("Boisson servie : " + pub.bar.serv("cafe"));
		logger.info(pub.bar.toString());
	}

}
