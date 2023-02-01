import java.util.HashMap;

class Bank {
    private HashMap<String, Account> accounts;

    Bank() {
        accounts = new HashMap<>();
    }

    public void createAccount(String code, String name) {
        Account account = new Account(code, name, 0);
        accounts.put(code, account);
        System.out.println("Account created successfully with code: " + code);
    }

    public void depositAmount(String code, int amount) {
        Account account = accounts.get(code);
        if (account == null) {
            System.out.println("No account found with code: " + code);
            return;
        }
        account.deposit(amount);
        System.out.println("Amount deposited successfully. New balance is: " + account.getBalance());
    }

    public void withdrawAmount(String code, int amount) {
        Account account = accounts.get(code);
        if (account == null) {
            System.out.println("No account found with code: " + code);
            return;
        }
        try {
            account.withdraw(amount);
            System.out.println("Amount withdrawn successfully. New balance is: " + account.getBalance());
        } catch (Exception e) {
            System.out.println("Insufficient balance. Transaction failed.");
        }
    }

    public void showBalance(String code) {
        Account account = accounts.get(code);
        if (account == null) {
            System.out.println("No account found with code: " + code);
            return;
        }
        System.out.println(account.getName() + " " + account.getBalance());
    }
}