package com.mycompany.hostelmapping;

public class HostelMapping {
    public static void main(String[] args) {
        // Group 2 Assigned Dataset (Hostels H06 - H10)
        Hostel[] assignedHostels = {
            new Hostel("H06", "Hide Out Hostel", "Self-contained (Single)", 500000, "Occupied", 0.60395471, 32.477914),
            new Hostel("H07", "White House Hostel", "Self-contained (Double)", 800000, "Occupied", 0.60321322, 32.477342),
            new Hostel("H08", "Bwino Hostel", "Not self-contained (Single)", 400000, "Occupied", 0.60204485, 32.477355),
            new Hostel("H09", "Soweto Hostel", "Not self-contained (Single)", 450000, "Partially Occupied", 0.60057318, 32.476658),
            new Hostel("H10", "GM Hostel", "Half self-contained (Single)", 500000, "Occupied", 0.60342536, 32.477061)
        };

        System.out.println("==================================================");
        System.out.println("           ASSIGNED HOSTELS DETAILS              ");
        System.out.println("==================================================");

        double totalRentalPrice = 0;
        int fullyOccupiedCount = 0;
        int notFullyOccupiedCount = 0;

        // Requirement 4: Loop to process all hostel records
        for (Hostel hostel : assignedHostels) {
            // Requirement 1 & 3: Display details
            hostel.displayDetails();

            // Accumulate total price for average calculation
            totalRentalPrice += hostel.getRentalPrice();

            // Requirement 6: Count fully occupied vs not fully occupied
            if (hostel.isOccupied()) {
                fullyOccupiedCount++;
            } else {
                notFullyOccupiedCount++;
            }
        }

        // Requirement 5: Calculate average rental price
        double averageRentalPrice = totalRentalPrice / assignedHostels.length;

        System.out.println("\n==================================================");
        System.out.println("                  SUMMARY REPORT                  ");
        System.out.println("==================================================");
        System.out.printf("Average Rental Price: UGX %,.2f%n", averageRentalPrice);
        System.out.println("Number of Fully Occupied Hostels: " + fullyOccupiedCount);
        System.out.println("Number of Not Fully Occupied Hostels: " + notFullyOccupiedCount);
        System.out.println("==================================================");
    }
}
