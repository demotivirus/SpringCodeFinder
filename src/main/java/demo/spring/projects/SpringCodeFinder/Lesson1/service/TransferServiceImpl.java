package demo.spring.projects.SpringCodeFinder.Lesson1.service;

import demo.spring.projects.SpringCodeFinder.Lesson1.model.Account;
import demo.spring.projects.SpringCodeFinder.Lesson1.model.Amount;
import demo.spring.projects.SpringCodeFinder.Lesson1.repository.AccountRepository;
import demo.spring.projects.SpringCodeFinder.Lesson1.repository.TransferRepository;

public class TransferServiceImpl implements TransferService{
    private AccountRepository accountRepository;
    private TransferRepository transferRepository;

    public TransferServiceImpl(AccountRepository accountRepository, TransferRepository transferRepository) {
        this.accountRepository = accountRepository;
        this.transferRepository = transferRepository;
    }

    @Override
    public void transferAmount(Long a, Long b, Amount amount) {
        Account accountA = accountRepository.findByAccountId(a);
        Account accountB = accountRepository.findByAccountId(b);
        transferRepository.transfer(accountA, accountB, amount);
    }
}
