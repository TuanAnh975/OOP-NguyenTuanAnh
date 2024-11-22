package hust.soict.globalict.aims.store;
import hust.soict.globalict.aims.disc.DigitalVideoDisc;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();

        // Create some DVDs
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Action", "Jungle", 10.0f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Animation", "Cinderella", 15.0f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Drama", "Titanic", 20.0f);

        // Add DVDs to the store
        store.addDVD(dvd1);
        store.addDVD(dvd2);
        store.addDVD(dvd3);

        // Display the store
        System.out.println("\nDisplaying the store:");
        store.displayStore();

        // Remove a DVD
        System.out.println("\nRemoving a DVD from the store:");
        store.removeDVD(dvd2);

        // Display the store after removal
        System.out.println("\nDisplaying the store after removal:");
        store.displayStore();

        // Attempt to remove a DVD not in the store
        System.out.println("\nAttempting to remove a DVD not in the store:");
        store.removeDVD(dvd2);
    }
}
