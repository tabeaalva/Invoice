
public class Tester {

	public static void main(String[] args) {
		
		Invoice invoice = new Invoice();
		
		Item item1 = new Item("Haarschaum", 4.90);
		Item item2 = new Item("Brot", 2.90);
		Item item3 = new Item("Cola 1l", 1.95);
		Item item4 = new Item("Snickers", 2.60);

		invoice.addItem(item1);
		invoice.addItem(item2);
		invoice.addItem(item3);
		invoice.addItem(item4);
		
		invoice.printInvoice();
	}

}