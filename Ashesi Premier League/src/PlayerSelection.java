import java.util.Scanner;

public class PlayerSelection {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter Player Name: ");
        String name = input.nextLine();

        System.out.print("Enter Age: ");
        int age = input.nextInt();

        System.out.print("Enter Height (cm): ");
        double height = input.nextDouble();

        System.out.print("Enter Weight (kg): ");
        double weight = input.nextDouble();

        System.out.print("Enter Jersey Number: ");
        int jersey = input.nextInt();

        // Checking the age range of the player
        String category;
        if (age < 18) {
            category = "Youth";
        } else if (age <= 35) {
            category = "Senior";
        } else {
            category = "Veteran";
        }


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
        }


        switch (jersey) {
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

        boolean isAttacker = (jersey == 9 || jersey == 10 || jersey == 11);


        boolean eligible;
        if (age >= 18 && age < 35) {
            eligible = weight < 90;
        } else {
            eligible = false;
        }

        String lineupDecision;
        if (eligible) {
            lineupDecision = "Selected for Lineup";
        } else {
            lineupDecision = "Not Selected";
        }


        String finalDecision = (eligible) ? "Play" : "Rest";

        System.out.println("\n===== PLAYER REPORT =====");
        System.out.println("Player: " + name);
        System.out.println("Age: " + age + " (" + category + ")");
        System.out.println("Height: " + height + " cm");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Jersey: " + jersey);
        System.out.println("Attacker jersey: " + (isAttacker ? "Yes" : "No"));
        System.out.println("Eligibility: " + (eligible ? "Eligible" : "Not Eligible"));
        System.out.println("Lineup Decision: " + lineupDecision);
        System.out.println("Final Decision: " + finalDecision);
    }
}
