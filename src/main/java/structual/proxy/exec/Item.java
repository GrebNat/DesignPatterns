package structual.proxy.exec;

public class Item {

    String name;
    double price;
    int quality;

    public Item(String name, double price, int quality) {
        this.name = name;
        this.price = price;
        this.quality = quality;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", price= $" + price +
                ", quality=" + quality;
    }
}
