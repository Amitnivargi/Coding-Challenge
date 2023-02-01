class Account {
    private String code;
    private String name;
    private int balance;

    Account(String code, String name, int balance) {
        this.code = code;
        this.name = name;
        this.balance = balance;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) throws Exception {
        if (balance < amount) {
            throw new Exception("Insufficient balance");
        }
        balance -= amount;
    }
}