package pizzaVoorbeeld;

public abstract class Pizza {

	public Pizza() {
		// TODO Auto-generated constructor stub
	}
	
	
	//template method
	public final void maakPizza(){
		maakBodem();
		if(klantWiltVlees()){
			voegVleesToe();
			System.out.println("");
		}
		if(klantWiltKaas()){
			voegKaasToe();
			System.out.println("");
		}
		if(klantWiltGroenten()){
			voegGroenteToe();
			System.out.println("");
		}
		doePizzaInOven();
		System.out.println("");
	}
	
	public void maakBodem(){
		System.out.println("De pizza bodem is gemaakt.");
	}
	
	public void doePizzaInOven() {
		System.out.println("De pizza is in de oven.");
	}

	public boolean klantWiltVlees() {
		return true;
	}
	
	public boolean klantWiltKaas() {
		return true;
	}
	
	public boolean klantWiltGroenten() {
		return true;
	}
	
	public abstract void voegVleesToe();
	public abstract void voegKaasToe();
	public abstract void voegGroenteToe();
}
