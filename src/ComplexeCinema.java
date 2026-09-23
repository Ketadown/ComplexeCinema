import java.util.ArrayList;

public class ComplexeCinema {
	private ArrayList<Cinema> liste_Cinemas= new ArrayList<Cinema>();

	public void ajouterCinema(Cinema c){
		liste_Cinemas.add(c);
	}

	public void afficherSeances_Complexe(){
		for(Cinema c : liste_Cinemas){
			c.afficherSeances_Cinema();
		}
	}
}
