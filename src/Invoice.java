
import java.util.ArrayList;

public class Invoice {

	private ArrayList<Item> items;
	
	public Invoice() {
		//kann auch direkt bei der Variable initialisiert werden
		this.items = new ArrayList<Item>();
	}
	
	public void addItem(Item item) {
		this.items.add(item);
	}

	public double getInvoiceAmountExcl() {
		double amount = 0;
		
		for(Item p : this.items) {
			amount += p.getPrice();
		}
		
		return amount;
	}
	
	public void printInvoice() {
		System.out.println("**********Rechnung**********");
		for(Item p : this.items) {
			System.out.println(p.getText() + ": " + p.getPrice());
		}
		System.out.println("TOTAL exkl. Mwst: " + this.getInvoiceAmountExcl());
	}
	
}