import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split(" ");
            if (parts.length == 0) {
                continue;
            }
            String command = parts[0];

            switch (command) {
                case "CREATE":
                    bank.createAccount(parts[1], parts[2]);
                    break;
                case "DEPOSIT":
                    bank.depositAmount(parts[1], Integer.parseInt(parts[2]));
                    break;
                case "WITHDRAW":
                    bank.withdrawAmount(parts[1], Integer.parseInt(parts[2]));
                    break;
                case "BALANCE":
                    bank.showBalance(parts[1]);
                    break;
                default:
                    System.out.println("Invalid command. Try again.");
                    break;
            }
        }
        scanner.close();
    }
}