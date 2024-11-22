package hust.soict.globalict.aims.cart;
import hust.soict.globalict.aims.disc.DigitalVideoDisc;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qty = 0;

    // Add a disc
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qty == MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is full");
            return;
        }
        itemsOrdered[qty] = disc;
        qty++;
        System.out.println("The disc " + disc.getTitle() + " has been added");
    }

    // Remove a disc
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
                System.out.println("The disc " + disc.getTitle() + " has been removed.");
                break;
            }
        }
        if (!found) {
            System.out.println("The disc is not found in the cart.");
        }
    }

    // Calculate total cost
    public float totalCost() {
        float total = 0;
        for (int i = 0; i < qty; i++) {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }

    // Print cart details
    public void print() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < qty; i++) {
            System.out.println((i + 1) + ". " + itemsOrdered[i].toString());
        }
        System.out.println("Total cost: " + totalCost() + " $");
        System.out.println("***************************************************");
    }

    // Search for a DVD by ID
    public void searchById(int id) {
        for (int i = 0; i < qty; i++) {
            if (itemsOrdered[i].getId() == id) {
                System.out.println("Found DVD: " + itemsOrdered[i].toString());
                return;
            }
        }
        System.out.println("No match found for ID: " + id);
    }

    // Search for DVDs by title
    public void searchByTitle(String title) {
        boolean found = false;
        for (int i = 0; i < qty; i++) {
            if (itemsOrdered[i].isMatch(title)) {
                System.out.println("Found DVD: " + itemsOrdered[i].toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No match found for title: " + title);
        }
    }
}
