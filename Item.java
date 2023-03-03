public class Item {

    // Fields
    private int lotNumber;
    private String buyerName;
    private double price;
    private int yearSold;
    private String category;

    // Constructor
    public Item(int lotNumber, String buyerName, double price, int yearSold, String category) {
        this.lotNumber = lotNumber;
        this.buyerName = buyerName;
        this.price = price;
        this.yearSold = yearSold;
        this.category = category;
    }

    // Getter methods
    public int getLotNumber() {
        return lotNumber;
    }
    public String getBuyerName() {
        return buyerName;
    }
    public double getPrice() {
        return price;
    }
    public int getYearSold() {
        return yearSold;
    }
    public String getCategory() {
        return category;
    }

    // Setter methods
    public void setLotNumber(int lotNumber) {
        this.lotNumber = lotNumber;
    }
    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setYearSold(int yearSold) {
        this.yearSold = yearSold;
    }
    public void setCategory(String category) {
        this.category = category;
    }
}
