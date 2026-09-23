import java.util.ArrayList;

public class Salle {

	private int numero;
	private int numeroTotal;
	private ArrayList<Seance> liste_Seances = new ArrayList<>();

	public Salle(int numero, int numeroTotal){
		this.numero=numero;
		this.numeroTotal=numeroTotal;
	}

	public void afficherSeances_Salle(){
		for(Seance s : liste_Seances){
			s.afficherSeance();
		}
	}

	public void ajouterSeance(Seance seance){
		liste_Seances.add(seance);
	}

	public String toString(){
		return "La Salle n°"+this.numero+" ";
	}

	public int getNbPlaces(){
		return numeroTotal;
	}

	public void setNbPlaces(int n){
		this.numeroTotal=n;
	}
}
