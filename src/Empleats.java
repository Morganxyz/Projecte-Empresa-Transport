
public abstract class Empleats {
	
	private String nom;
	private int edat;
	private float salari;
	private final float PLUS = 300;
	
	public Empleats (String nom, int edat,float salari) {
		
		this.nom = nom;
		this.edat = edat;
		this.salari = salari;
	}
	
	public String getNom () {
		return this.nom;
	}
	
	public int getEdat () {
		return this.edat;
	}
	public float getSalari () {
		return this.salari;
	}
	
	public float getPLUS () {
		return this.PLUS;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setEdat(int edat) {
		this.edat = edat;
	}
	public void setSalari(float salari) {
		this.salari = salari;
	}
	public abstract boolean getPlus();

}
