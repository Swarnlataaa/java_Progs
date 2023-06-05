import java.util.Scanner;

// Class to represent the carbon footprint of a human
class CarbonFootprint {
    private double foodCarbonFootprint;
    private double transportationCarbonFootprint;
    private double energyCarbonFootprint;
    private double totalCarbonFootprint;

    // Constructor
    public CarbonFootprint(double foodCarbonFootprint, double transportationCarbonFootprint,
            double energyCarbonFootprint) {
        this.foodCarbonFootprint = foodCarbonFootprint;
        this.transportationCarbonFootprint = transportationCarbonFootprint;
        this.energyCarbonFootprint = energyCarbonFootprint;
        this.totalCarbonFootprint = calculateTotalCarbonFootprint();
    }

    // Calculate the total carbon footprint
    private double calculateTotalCarbonFootprint() {
        return foodCarbonFootprint + transportationCarbonFootprint + energyCarbonFootprint;
    }

    // Getter methods
    public double getFoodCarbonFootprint() {
        return foodCarbonFootprint;
    }

    public double getTransportationCarbonFootprint() {
        return transportationCarbonFootprint;
    }

    public double getEnergyCarbonFootprint() {
        return energyCarbonFootprint;
    }

    public double getTotalCarbonFootprint() {
        return totalCarbonFootprint;
    }
}

// Class to ask lifestyle questions and calculate carbon footprint based on the
// answers
