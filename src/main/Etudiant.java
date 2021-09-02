package main;

public class Etudiant {
	private int id;
	private String nom;
	private String email;
	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Etudiant(int id, String nom, String email) {
		super();
		this.id = id;
		this.nom = nom;
		this.email = email;
	}
	public Etudiant(String nom, String email) {
		super();
		this.nom = nom;
		this.email = email;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Etudiant [nom=" + nom + ", email=" + email + "]";
	}

}
