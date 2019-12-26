package demo.spring.projects.SpringCodeFinder.Lesson1.config;

import demo.spring.projects.SpringCodeFinder.Lesson1.aspect.LoggingAspect;
import demo.spring.projects.SpringCodeFinder.Lesson1.repository.AccountRepository;
import demo.spring.projects.SpringCodeFinder.Lesson1.repository.JdbcAccountRapository;
import demo.spring.projects.SpringCodeFinder.Lesson1.repository.JdbcTransferRepository;
import demo.spring.projects.SpringCodeFinder.Lesson1.repository.TransferRepository;
import demo.spring.projects.SpringCodeFinder.Lesson1.service.TransferService;
import demo.spring.projects.SpringCodeFinder.Lesson1.service.TransferServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AppConfig {

    @Bean
    public TransferService transferService(){
        return new TransferServiceImpl(accountRepository(), transferRepository());
    }
    @Bean
    public AccountRepository accountRepository() {
        return new JdbcAccountRapository();
    }
    @Bean
    public TransferRepository transferRepository() {
        return new JdbcTransferRepository();
    }
    @Bean
    public LoggingAspect loggingAspect() {
        return new LoggingAspect();
    }
}
