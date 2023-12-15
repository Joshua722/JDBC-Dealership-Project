package com.pluralsight.dealership;

import java.util.Date;

import static com.pluralsight.dealership.DataManager.myScanner;

public class Main {
    public static void main(String[] args) {
        DataManager.startConnection();
        while (true) {
            System.out.println("""
                    Welcome to our Dealership!
                    Here are your options.
                    1) Search through Dealership
                    2) Add Cars to Dealership
                    3) Remove Cars from Dealership
                    4) Buy a Car (Sale)
                    5) Lease a car
                    0) Exit
                    """);
            String choice = myScanner.nextLine();
            switch (choice) {
                case "1":
                    DataManager.searchCar();
                    break;
                case "2":
                    DataManager.newCar();
                    break;
                case "3":
                    DataManager.deleteCar();
                    break;
                case "4":
                    SaleContractDAO.carSold();
                    break;
                case "5":
                    LeaseContractDAO.carLeased();
                    break;
                case "0":
                    myScanner.close();
                    System.exit(0);
            }
        }
    }
}
