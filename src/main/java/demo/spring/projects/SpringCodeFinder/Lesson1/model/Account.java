package demo.spring.projects.SpringCodeFinder.Lesson1.model;

public class Account {
    private static final long serialVersionUID = 1L;
    private Long accountId;
    private String name;
    private Amount amount;

    public Account(Long accountId, String name, Amount amount) {
        this.accountId = accountId;
        this.name = name;
        this.amount = amount;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Amount getAmount() {
        return amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                '}';
    }
}
