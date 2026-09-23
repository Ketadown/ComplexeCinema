public class Seance {
	private Film film;
	private Salle salle;

	public Seance(Film film, Salle salle){
		this.film=film;
		this.salle=salle;
	}

	public void afficherSeance(){
		System.out.println(salle+"projetera le "+film);
	}
}
