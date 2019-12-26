package demo.spring.projects.SpringCodeFinder.Lesson1.model;

public class Amount {
    private Double balance;

    public Amount(Double balance) {
        this.balance = balance;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Amount{" +
                "balance=" + balance +
                '}';
    }
}
