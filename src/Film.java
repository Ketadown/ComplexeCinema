public class Film {
	private String titre;
	private String realisateur;
	private int duree;

	public Film(String titre, String realisateur,int duree){
		this.titre=titre;
		this.realisateur=realisateur;
		this.duree=duree;
	}

	public String toString() {
		 return "Film : "+this.titre+" réalisé par : "+this.realisateur;
	}
}
