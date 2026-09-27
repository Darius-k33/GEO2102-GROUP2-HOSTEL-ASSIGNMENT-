package com.mycompany.hostelmapping;

public class Hostel {
    private String hostelId;
    private String hostelName;
    private String accommodationType;
    private double rentalPrice;
    private String occupancyStatus;
    private double latitude;
    private double longitude;

    // Constructor
    public Hostel(String hostelId, String hostelName, String accommodationType, 
                  double rentalPrice, String occupancyStatus, double latitude, double longitude) {
        this.hostelId = hostelId;
        this.hostelName = hostelName;
        this.accommodationType = accommodationType;
        this.rentalPrice = rentalPrice;
        this.occupancyStatus = occupancyStatus;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    // Getters
    public String getHostelId() { return hostelId; }
    public String getHostelName() { return hostelName; }
    public String getAccommodationType() { return accommodationType; }
    public double getRentalPrice() { return rentalPrice; }
    public String getOccupancyStatus() { return occupancyStatus; }
    public double getLatitude() { return latitude; }
    public double getLongitude() { return longitude; }

    // Requirement 2: Boolean value for occupancy status
    public boolean isOccupied() {
        return "Occupied".equalsIgnoreCase(this.occupancyStatus);
    }

    // Requirement 1 & 3: Display details and status report
    public void displayDetails() {
        System.out.println("ID: " + hostelId);
        System.out.println("Name: " + hostelName);
        System.out.println("Type: " + accommodationType);
        System.out.printf("Rental Price: UGX %,.2f%n", rentalPrice);
        System.out.println("Occupancy Status: " + occupancyStatus);
        System.out.println("Coordinates: (" + latitude + ", " + longitude + ")");
        System.out.println("Is Occupied (Boolean): " + isOccupied());
        // Requirement 3: Selection statement
        if (isOccupied()) {
            System.out.println("Status Report: Fully Occupied");
        } else {
            System.out.println("Status Report: Not Fully Occupied");
        }
        System.out.println("--------------------------------------------------");
    }
}
