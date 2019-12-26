package demo.spring.projects.SpringCodeFinder.Lesson1.repository;

import demo.spring.projects.SpringCodeFinder.Lesson1.model.Account;
import demo.spring.projects.SpringCodeFinder.Lesson1.model.Amount;

public interface TransferRepository {
    void transfer(Account accountA, Account accountB, Amount amount);
}
