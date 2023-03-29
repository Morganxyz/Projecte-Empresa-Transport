
public class Repartidor extends Empleats{

	private String zona;
	boolean plus = false;
	
	public Repartidor(String nom,int edat, float salari, String zona) {
		super(nom, edat, salari);
		this.zona = zona;
	}
	
	public String getZona() {
		return this.zona;
	}
	
	public void setZona(String zona) {
		this.zona = zona;
	}
	
	public String toString() {
	
		return "El repartidor de nom " + super.getNom() + " i edat " + super.getEdat() + " te un salari de "
				+ super.getSalari() + " i treballa a la " + this.zona;
	}
	
	public boolean getPlus() {
		
		if(super.getEdat() < 25 && getZona().equalsIgnoreCase("Zona 3")){
			plus = true;
			super.setSalari(super.getSalari() + super.getPLUS());	
		}	
		return plus;
		}
}
