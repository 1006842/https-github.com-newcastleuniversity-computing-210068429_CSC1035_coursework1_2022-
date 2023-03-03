import java.sql.SQLOutput;
import java.util.Scanner;

import static jdk.internal.jimage.decompressor.CompressIndexes.readInt;

public class ReportingIO {

    public static void main(String[] args) {
        Reporting reporting = new Reporting();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Please choose an option:");
            System.out.println("1. Enter AuctionHouse data");
            System.out.println("2. Enter Item data");
            System.out.println("3. Reporting statistics");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    AuctionHouse auctionHouse = createAuctionHouse(scanner);
                    reporting.addAuctionHouse(auctionHouse);
                    break;

                case 2:
                    Item item = createItem(scanner);
                    reporting.addItem(item);
                    break;

                case 3:
                    printStatisticsMenu();
                    break;

                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please choose again.");
                    break;
            }
        }
    }

    // Method to create an AuctionHouse object based on user input
    private static AuctionHouse createAuctionHouse(Scanner scanner) {
        System.out.println("Enter the name of the auction house:");
        String name = scanner.next();
        return new AuctionHouse(name);
    }

    // Method to create an Item object based on user input
    private static Item createItem(Scanner scanner) {
        System.out.println("Enter the item lot number:");
        int lotNumber = scanner.nextInt();

        System.out.println("Enter the name of the buyer:");
        String buyerName = scanner.next();

        System.out.println("Enter the price for which the item was sold:");
        double price = scanner.nextDouble();

        System.out.println("Enter the year in which the item was sold:");
        int year = scanner.nextInt();
        return null;
    }

    private static void printStatisticsMenu() {
        int year = 0;
        System.out.println("Reporting statistics:");
        System.out.println("1. Auction house with largest average item price for a given year");
        System.out.println("2. Highest price item ever reported");
        System.out.println("3. All items sold with a price greater than a given amount");

        Scanner scanner2 = new Scanner(System.in);
        int choice = scanner2.nextInt();

        switch (choice) {

            case 1:
                System.out.println("Enter a year: ");
                year = scanner2.nextInt();
                Reporting.getAuctionHouseWithLargestAveragePrice(year);
                break;
            case 2:
                Reporting.getLargestPricedItem();
                break;
            case 3:
                System.out.println("Enter a price: ");
                double price = scanner2.nextDouble();
                Reporting.getItemsSoldAbovePrice(price);
                break;
            case 4:
                boolean quit = true;
                break;
            default:
                System.out.println("Invalid choice, please try again.");
                break;
        }

    }
}