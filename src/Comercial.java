
public class Comercial extends Empleats{

	
	private double comissio;
	boolean plus = false;
	
	public Comercial(String nom, int edat, float salari, double comissio) {
		
		super(nom,edat,salari);
		this.comissio = comissio;
	}
	
	public double getComissio() {
		return this.comissio;
	}
	
	public void setComissio(double comissio) {
		this.comissio = comissio;
	}
	
	public String toString() {
		
		return "El comercial de nom " + super.getNom() + " i edat " + super.getEdat() + " te un salari incial de "
				+ super.getSalari() + " amb una comissió de " + this.comissio + " Euros.";
	}
	
	public boolean getPlus() {
		
		if (super.getEdat() > 30 && this.comissio > 200) {
			setSalari(super.getSalari() + super.getPLUS());
			plus = true;
		}
		return plus;
	}
	
}
