import java.util.Scanner;
public class FootballPlayer {
    public static void main(String[] args){

        // Task 1
        String name;
        int age;

        // In meters
        float height;

        // In pounds
        float weight;
        int jerseyNumber;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = input.nextLine();

        System.out.println("Enter your age: ");
        age = input.nextInt();

        System.out.println("Enter your height(in meters): ");
        height = input.nextFloat();

        System.out.println("Enter your weight(in pounds): ");
        weight = input.nextFloat();

        System.out.println("Enter your jersey number: ");
        jerseyNumber = input.nextInt();

        // Display the result
        System.out.println("Player Name: " + name);
        System.out.println("Age: " + age + " years");
        System.out.println("Height: " + height + " m");
        System.out.println("Weight: " + weight + " lbs");
        System.out.println("Jersey Number: " + jerseyNumber);



        // Task 2
        final double pound = 0.45359237;
        final int meter = 100;

        // Convert the weight to kilograms
        int weight_to_kg = (int) (weight * pound);

         // Convert the height to centimeters
        int height_to_cm = (int)(height * meter);

        // Display the result
        System.out.println("\nPlayer Name: " + name);
        System.out.println("Age: " + age + " years");
        System.out.println("Height: " + height_to_cm + " cm");
        System.out.println("Weight: " + weight_to_kg + " kg");
        System.out.println("Jersey Number: " + jerseyNumber);


        // Task 3
        System.out.println("\nAge: " + age + " years");

        int new_age = ++ age;
        int penalty = -- jerseyNumber;

        System.out.println("\nAge: " + new_age + " years");
        System.out.println("Jersey Number: " + penalty);

        // Task 4
        // AND (&&)
        if (age >= 18 && age < 35 && weight < 90) {
            System.out.println("Eligible!");
        }
        else{
            System.out.println("Not eligible!");
        }

        // OR (||)
        if (age >= 18 || weight_to_kg >= 90){
            System.out.println(name + " has a problem (either too young or too heavy)");
        }

        // NOT (!)
        if (!(age >= 18 && age <= 35 && weight < 90)) {
            System.out.println("Eligible!");
        }
        else{
            System.out.println("Not eligible!");
        }

        // Task 5
        if (age < 20){
            System.out.println(name + " is a rising Star");
        } else if (age > 20 && age <= 30) {
            System.out.println(name + " is a prime player.");
        } else {
            System.out.println(name + " is a veteran.");
        }

        // Task 6
        int coachInput;

        // Print a menu to guide the coaches decision
        System.out.println("1 = Goalkeeper");
        System.out.println("2 = Defender");
        System.out.println("6 = Midfielder");
        System.out.println("5 = Defender");
        System.out.println("7 = Winger");
        System.out.println("8 = Midfielder ");
        System.out.println("9 = Striker");
        System.out.println("10 = Playmaker ");
        System.out.println("11 = Winger");

        coachInput = input.nextInt();

        switch (coachInput) {
            case 1:
                System.out.println("Goalkeeper");
                break;
             // Combined the cases because they have the same output
            case 2:
            case 5:
                System.out.println("Defender");
                break;
            case 6:
            case 8:
                System.out.println("Midfielder");
                break;
            case 7:
            case 11:
                System.out.println("Winger");
                break;
            case 9:
                System.out.println("Striker");
                break;
            case 10:
                System.out.println("Playmaker");
                break;
            default:
                System.out.println("Player position not known!");


        // Task 7
        switch (jerseyNumber){
            case 2:
                System.out.println("Defender");
            case 6:
                System.out.println("Midfielder");
            case 7:
                System.out.println("Winger");
        }

        switch (jerseyNumber) {
            case 2:
            case 5:
                System.out.println("Defender");
                break;
            case 6:
            case 8:
                System.out.println("Midfielder");
                break;
            case 7:
            case 11:
                System.out.println("Winger");
                break;
            case 9:
                System.out.println("Striker");
                break;
            case 10:
                System.out.println("Playmaker");
                break;
            case 1:
                System.out.println("Goalkeeper");
                break;
            default:
                System.out.println("Player position not known!");
        }

        // Task 8
        if (age > 20 && age <= 30){
            if (weight_to_kg < 80){
                System.out.println(name + " is in the starting lineup!");
            }
            else{
                System.out.println(name + " goes to the bench!");
            }
        }
        else{
            System.out.println(name + " goes to the bench!");
        }

        // Task 9
        // The ternary operator format -> "condition ? value_if_true : value_if_false"
        String finalDecision = (age >= 18 && age < 35 && weight < 90) ? "Play" : "Rest";
        System.out.println(finalDecision + " is the final decision.");
        }
    }
}