// Class to ask lifestyle questions and calculate carbon footprint based on the answers
import java.util.Scanner;

class CarbonFootprintCalculator {
    private Scanner scanner;

    // Constructor
    public CarbonFootprintCalculator() {
        scanner = new Scanner(System.in);
    }

    // Ask lifestyle questions and calculate carbon footprint
    public CarbonFootprint calculateCarbonFootprint() {
        System.out.println("Please answer the following questions to calculate your carbon footprint:");

        // Ask food-related questions
        System.out.print("Do you eat a vegetarian diet? (yes/no): ");
        String vegetarianAnswer = scanner.nextLine();
        double foodCarbonFootprint = calculateFoodCarbonFootprint(vegetarianAnswer);

        // Ask transportation-related questions
        System.out.print("How do you commute? (car/bike/public transport): ");
        String commuteAnswer = scanner.nextLine();
        double transportationCarbonFootprint = calculateTransportationCarbonFootprint(commuteAnswer);

        // Ask energy-related questions
        System.out.print("Do you use renewable energy sources? (yes/no): ");
        String renewableEnergyAnswer = scanner.nextLine();
        double energyCarbonFootprint = calculateEnergyCarbonFootprint(renewableEnergyAnswer);

        return new CarbonFootprint(foodCarbonFootprint, transportationCarbonFootprint, energyCarbonFootprint);
    }

    // Calculate the carbon footprint based on food choices
    private double calculateFoodCarbonFootprint(String vegetarianAnswer) {
        if (vegetarianAnswer.equalsIgnoreCase("yes")) {
            return 1.5; // Low carbon footprint for vegetarian diet
        } else {
            return 3.5; // Higher carbon footprint for non-vegetarian diet
        }
    }

    // Calculate the carbon footprint based on transportation choices
    private double calculateTransportationCarbonFootprint(String commuteAnswer) {
        if (commuteAnswer.equalsIgnoreCase("car")) {
            return 4.0; // Higher carbon footprint for car commute
        } else if (commuteAnswer.equalsIgnoreCase("bike")) {
            return 0.5; // Low carbon footprint for bike commute
        } else {
            return 2.0; // Moderate carbon footprint for public transport commute
        }
    }

    // Calculate the carbon footprint based on energy choices
    private double calculateEnergyCarbonFootprint(String renewableEnergyAnswer) {
        if (renewableEnergyAnswer.equalsIgnoreCase("yes")) {
            return 1.0; // Low carbon footprint for using renewable energy sources
        } else {
            return 3.0; // Higher carbon footprint for using non-renewable energy sources
        }
    }
}
