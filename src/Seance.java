public class Seance {
	private Film film;
	private Salle salle;
	private int nbReservation;

	public Seance(Film film, Salle salle){
		this.film=film;
		this.salle=salle;
	}

	public void reserver(){
		reserver(1);
	}

	public void reserver(int nbPlaces_Reserve){
		int nbplace_salle=this.salle.getNbPlaces();

		if (nbplace_salle>nbPlaces_Reserve+nbReservation){
			nbReservation+=nbPlaces_Reserve;
		}
		else{
			System.out.println("Réservation complète");
		}
	}

	public double getTauxCompletion(){
		int nbplace_salle=this.salle.getNbPlaces();
		double taux = (double)nbReservation/(double)nbplace_salle*100;
		return taux;
	}

	public void afficherSeance(){
		System.out.println(salle+"projetera le "+film+" à un taux d'occupation de "+getTauxCompletion()+"%");
	}
}
