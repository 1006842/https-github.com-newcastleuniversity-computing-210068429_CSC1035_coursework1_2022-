
import java.util.ArrayList;
import java.util.List;

public class Reporting {

    // Fields
    private static List<AuctionHouse> auctionHouses;

    // Constructor
    public Reporting() {
        this.auctionHouses = new ArrayList<>();
    }

    // Method to add an auction house to the list
    public void addAuctionHouse(AuctionHouse auctionHouse) {
        auctionHouses.add(auctionHouse);
    }

    // Method to find the item with the highest price ever recorded
    public Item getLargestPricedItem() {
        Item largestPricedItem = null;
        double largestPrice = Double.MIN_VALUE;
        for (AuctionHouse auctionHouse : auctionHouses) {
            Item highestPricedItem = auctionHouse.getHighestPricedItem();
            if (highestPricedItem != null && highestPricedItem.getPrice() > largestPrice) {
                largestPrice = highestPricedItem.getPrice();
                largestPricedItem = highestPricedItem;
            }
        }
        return largestPricedItem;
    }

    // Method to find the auction house with the highest average price for a selectd year
    public static AuctionHouse getAuctionHouseWithLargestAveragePrice(int year) {
        AuctionHouse largestAveragePriceAuctionHouse = null;
        double largestAveragePrice = Double.MIN_VALUE;
        for (AuctionHouse auctionHouse : auctionHouses) {
            double averagePrice = auctionHouse.getAverageItemPrice(year);
            if (averagePrice > largestAveragePrice) {
                largestAveragePrice = averagePrice;
                largestAveragePriceAuctionHouse = auctionHouse;
            }
        }
        return largestAveragePriceAuctionHouse;
    }

    // Method to find all items sold above a selected price across all auction houses
    public List<Item> getItemsSoldAbovePrice(double price) {
        List<Item> itemsAbovePrice = new ArrayList<>();
        for (AuctionHouse auctionHouse : auctionHouses) {
            List<Item> items = auctionHouse.getItemsSoldAbovePrice(price);
            itemsAbovePrice.addAll(items);
        }
        return itemsAbovePrice;
    }
}