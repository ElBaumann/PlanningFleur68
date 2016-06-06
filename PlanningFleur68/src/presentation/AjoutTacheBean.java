package presentation;

public class AjoutTacheBean {

	String nom;
	String prenom;
	String typeDeTache;
	String adresse;
	String dateDebut;
	String dateFinReal;
	String etat;

	public AjoutTacheBean() {
	}

	public AjoutTacheBean(String nom, String prenom, String typeDeTache, String adresse, String dateDebut,
			String dateFinReal, String etat) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.typeDeTache = typeDeTache;
		this.adresse = adresse;
		this.dateDebut = dateDebut;
		this.dateFinReal = dateFinReal;
		this.etat = etat;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public String getTypeDeTache() {
		return typeDeTache;
	}

	public void setTypeDeTache(String typeDeTache) {
		this.typeDeTache = typeDeTache;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(String dateDebut) {
		this.dateDebut = dateDebut;
	}

	public String getDateFinReal() {
		return dateFinReal;
	}

	public void setDateFinReal(String dateFinReal) {
		this.dateFinReal = dateFinReal;
	}

	@Override
	public String toString() {
		return "AjoutTacheBean [nom=" + nom + ", prenom=" + prenom + ", typeDeTache=" + typeDeTache + ", adresse="
				+ adresse + ", dateDebut=" + dateDebut + ", dateFinReal=" + dateFinReal + ", etat=" + etat + "]";
	}

}
