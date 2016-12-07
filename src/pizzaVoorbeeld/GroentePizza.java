package pizzaVoorbeeld;

public class GroentePizza extends Pizza{

	String[] groenten = {"Ui", "Tomaat", "Champignon", "Spinazie", "Ananas"};
	String[] kaas = {"Provolone", "Mozzarella"};
	
	public GroentePizza() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void voegVleesToe() {
		// TODO Auto-generated method stub
	}

	@Override
	public void voegKaasToe() {
		System.out.print("Kaas toevoegen: ");
		for(String k : kaas){
			System.out.print(k + " ");
		}
	}

	@Override
	public void voegGroenteToe() {
		System.out.print("Groenten toevoegen: ");
		for(String groente : groenten){
			System.out.print(groente + " ");
		}
		
	}
	
	@Override
	public boolean klantWiltVlees() {
		return false;
	}

}
