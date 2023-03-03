import java.util.ArrayList;
import java.util.List;

public class AuctionHouse {

    // Fields
    private String name;
    private List<Item> soldItems;

    // Constructor
    public AuctionHouse(String name) {
        this.name = name;
        this.soldItems = new ArrayList<>();
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public List<Item> getSoldItems() {
        return soldItems;
    }

    // Method to add a sold item to the list
    public void addSoldItem(Item item) {
        soldItems.add(item);
    }

    // Method to find the item with the highest price ever sold
    public Item getHighestPricedItem() {
        Item highestPricedItem = null;
        double highestPrice = Double.MIN_VALUE;
        for (Item item : soldItems) {
            if (item.getPrice() > highestPrice) {
                highestPrice = item.getPrice();
                highestPricedItem = item;
            }
        }
        return highestPricedItem;
    }

    // Method to find the average item price for a selected year
    public double getAverageItemPrice(int year) {
        int count = 0;
        double totalPrice = 0;
        for (Item item : soldItems) {
            if (item.getYearSold() == year) {
                totalPrice += item.getPrice();
                count++;
            }
        }
        if (count == 0) {
            return 0;
        }
        return totalPrice / count;
    }

    // Method to find all items sold above a selected price
    public List<Item> getItemsSoldAbovePrice(double price) {
        List<Item> itemsAbovePrice = new ArrayList<>();
        for (Item item : soldItems) {
            if (item.getPrice() > price) {
                itemsAbovePrice.add(item);
            }
        }
        return itemsAbovePrice;
    }
}