import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();

        // Continuously read inputs from the user
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            String[] parts = input.split(" ");
            String command = parts[0];

            // Trim any leading or trailing whitespaces from the account code
            String code = parts[1].trim();

            // Use a switch statement to handle different commands
            switch (command) {
                case "CREATE":
                    // Call the createAccount method and pass the account code and name as arguments
                    bank.createAccount(code, parts[2]);
                    break;
                case "DEPOSIT":
                    // Call the depositAmount method and pass the account code and amount as arguments
                    bank.depositAmount(code, Integer.parseInt(parts[2]));
                    break;
                case "WITHDRAW":
                    // Call the withdrawAmount method and pass the account code and amount as arguments
                    bank.withdrawAmount(code, Integer.parseInt(parts[2]));
                    break;
                case "BALANCE":
                    // Call the showBalance method and pass the account code as an argument
                    bank.showBalance(code);
                    break;
                default:
                    // If the command is not recognized, print an error message
                    System.out.println("Invalid command. Try again.");
                    break;
            }
        }

        // Close the scanner after all inputs have been read
        scanner.close();
    }

}
