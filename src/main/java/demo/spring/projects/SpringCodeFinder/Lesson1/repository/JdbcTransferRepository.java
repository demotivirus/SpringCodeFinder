package demo.spring.projects.SpringCodeFinder.Lesson1.repository;

import demo.spring.projects.SpringCodeFinder.Lesson1.model.Account;
import demo.spring.projects.SpringCodeFinder.Lesson1.model.Amount;

public class JdbcTransferRepository implements TransferRepository{
    @Override
    public void transfer(Account accountA, Account accountB, Amount amount) {
        System.out.println("Transfer amount from account A to B in JPA impl");
    }
}
