import java.util.ArrayList;

public class Cinema {
	private String ville;
	private ArrayList<Salle> liste_Salles = new ArrayList<Salle>();
	private ArrayList<Seance> liste_Seances = new ArrayList<Seance>();

	public Cinema(String ville){
		this.ville=ville;
	}

	public void ajouterSalle(Salle salle){
		liste_Salles.add(salle);
	}

	public void ajouterSeance(Seance seance){
		liste_Seances.add(seance);
	}

	public void afficherSeances_Cinema(){
		for(Salle s : liste_Salles){
			s.afficherSeances_Salle();
		}
	}
}
