package demo.spring.projects.SpringCodeFinder.Lesson1.repository;

import demo.spring.projects.SpringCodeFinder.Lesson1.model.Account;

public interface AccountRepository {
    Account findByAccountId(Long accountId);
}
