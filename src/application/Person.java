package application;

public class Person {
	private String prenom2;
	private String nom2;
	private String email2;
	@Override
	public String toString() {
		return "Person [prenom2=" + prenom2 + ", nom2=" + nom2 + ", email2=" + email2 + "]";
	}
	public Person(String prenom2, String nom2, String email2) {
		super();
		this.prenom2 = prenom2;
		this.nom2 = nom2;
		this.email2 = email2;
	}
	public String getPrenom2() {
		return prenom2;
	}
	public void setPrenom2(String prenom2) {
		this.prenom2 = prenom2;
	}
	public String getNom2() {
		return nom2;
	}
	public void setNom2(String nom2) {
		this.nom2 = nom2;
	}
	public String getEmail2() {
		return email2;
	}
	public void setEmail2(String email2) {
		this.email2 = email2;
	}
	
	
	

}
