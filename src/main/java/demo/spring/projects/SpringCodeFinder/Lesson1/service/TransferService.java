package demo.spring.projects.SpringCodeFinder.Lesson1.service;

import demo.spring.projects.SpringCodeFinder.Lesson1.model.Amount;

public interface TransferService {
    void transferAmount(Long a, Long b, Amount amount);
}
