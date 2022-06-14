package structual.proxy.exec;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new SuperStoreInventoryProxy();

        Store store = new Store("fghj", "jgjhg", inventory);

        store.printName();
        store.printLocation();
        store.printInventory();
    }
}
