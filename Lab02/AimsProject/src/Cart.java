
public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = 
			new DigitalVideoDisc [MAX_NUMBERS_ORDERED];
	
	private int qty = 0;
	
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qty == 20) {
			System.out.println("The cart is full");
			return;
		}
		itemsOrdered[qty] = disc;
		qty ++;
		System.out.println("The disc has been added");
		if (qty == 20) {
			System.out.println("The cart is almost full");
		}
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
	       boolean found = false;
	       for (int i = 0; i < qty; i++) {
	            if (itemsOrdered[i].equals(disc)) {
	                found = true;
	                for (int j = i; j < qty - 1; j++) {
	                    itemsOrdered[j] = itemsOrdered[j + 1];
	                }
	                itemsOrdered[qty - 1] = null;
	                qty--;
	                System.out.println("The disc has been removed.");
	                break;
	            }
	        }
	        if (!found) {
	            System.out.println("The disc is not found in the cart.");
	        }
	    }
	
	public float totalCost() {
		float total = 0;
		for (int i = 0; i < qty; i++) {
			total += itemsOrdered[i].getCost();
		}
		
		return total;
	}
	
}
