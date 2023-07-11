public class Account {

    private Integer number;
    private String holder;
    private Double balance;
    private Double limit;

    public Account(Integer number, String holder, Double balance, Double limit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.limit = limit;
    }

    public void deposit(Double amount) {
        balance += amount;
    }

    public void withdraw(Double amount) throws DomainException {
        if (amount <= limit && amount <= balance) {
            balance -= amount;
            System.out.println("Sucessful withdraw");
        } else
            throw new DomainException("Withdraw error: The amount exceeds withdraw limit");
    }


    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getLimit() {
        return limit;
    }

    public void setLimit(Double limit) {
        this.limit = limit;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Number: " + number + " - ");
        sb.append(" Holder: " + holder + " - ");
        sb.append(" Balance: " + String.format("%.2f", balance) + " - ");
        sb.append(" Limit: " + limit);

        return sb.toString();
    }
}
