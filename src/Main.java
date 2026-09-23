public class Main {
	public static void main() {

		//Complexe :

		ComplexeCinema c = new ComplexeCinema();

		//Création de deux cinémas :

		Cinema c1= new Cinema("Toulouse");
		c.ajouterCinema(c1);
		Cinema c2 = new Cinema("Cugnaux");
		c.ajouterCinema(c2);
		Cinema c3 = new Cinema("Seilh");
		c.ajouterCinema(c3);
		Cinema c4 = new Cinema("Lagardelle sur Lèze");
		c.ajouterCinema(c4);

		//Création de salles :

		Salle s1 = new Salle(1,150);
		c1.ajouterSalle(s1);
		Salle s2 = new Salle(2,130);
		c2.ajouterSalle(s2);
		Salle s3 = new Salle(3,155);
		c3.ajouterSalle(s3);
		Salle s4 = new Salle(4,120);
		c4.ajouterSalle(s4);
		Salle s5 = new Salle(5,100);
		c4.ajouterSalle(s5);

		//Création de plusieurs films :

		Film f1 = new Film("Forest Gump","Robert Zemeckis",144);
		Film f2 = new Film("Mosul","Matthew Michael Cranahan",101);
		Film f3 = new Film("Fight club","David Fincher",139);
		Film f4 = new Film("Cars 2","John Lasseter",104);
		Film f5 = new Film("Ocean's Eleven","Steeve Stodbergh",116);

		//Programmation des séances :

		Seance se1 = new Seance(f1,s1);
		s1.ajouterSeance(se1);
		Seance se2 = new Seance(f2,s2);
		s2.ajouterSeance(se2);
		Seance se3 = new Seance(f3,s3);
		s3.ajouterSeance(se3);
		Seance se4 = new Seance(f4,s4);
		s4.ajouterSeance(se4);
		Seance se5 = new Seance(f5,s5);
		s5.ajouterSeance(se5);

		//Test de la méthode reserver :

		se1.reserver(12);

		//Affichages séances du complexe :

		c.afficherSeances_Complexe();


	}
}
