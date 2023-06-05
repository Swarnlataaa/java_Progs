// Main class to run the program
public class CarbonFootprintCalculatorMain {
    public static void main(String[] args) {
        // Create an instance of the CarbonFootprintCalculator
        CarbonFootprintCalculator calculator = new CarbonFootprintCalculator();

        // Calculate the carbon footprint
        CarbonFootprint footprint = calculator.calculateCarbonFootprint();

        // Display the results
        System.out.println("\n--- Carbon Footprint Calculation ---");
        System.out.println("Food Carbon Footprint: " + footprint.getFoodCarbonFootprint());
        System.out.println("Transportation Carbon Footprint: " + footprint.getTransportationCarbonFootprint());
        System.out.println("Energy Carbon Footprint: " + footprint.getEnergyCarbonFootprint());
        System.out.println("Total Carbon Footprint: " + footprint.getTotalCarbonFootprint());
    }
}
