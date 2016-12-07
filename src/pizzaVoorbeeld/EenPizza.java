package pizzaVoorbeeld;

public class EenPizza extends Pizza{
	
	String[] vlees = {"Ham", "Salami", "Kip"};
	String[] groenten = {"Ui", "Tomaat", "Ananas"};
	String[] kaas = {"Provolone", "Mozzarella"};
	
	public EenPizza() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void voegVleesToe() {
		System.out.print("Vlees toevoegen: ");
		for(String v : vlees){
			System.out.print(v+ " ");
		}
		
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

}
