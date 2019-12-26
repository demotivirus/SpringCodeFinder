package demo.spring.projects.SpringCodeFinder.Lesson1.repository;

import demo.spring.projects.SpringCodeFinder.Lesson1.model.Account;
import demo.spring.projects.SpringCodeFinder.Lesson1.model.Amount;

public class JdbcAccountRapository implements AccountRepository{
    @Override
    public Account findByAccountId(Long accountId) {
        return new Account(accountId, "James Bond", new Amount(7000.0));
    }
}
