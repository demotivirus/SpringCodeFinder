package demo.spring.projects.SpringCodeFinder.Lesson1;

import demo.spring.projects.SpringCodeFinder.Lesson1.config.AppConfig;
import demo.spring.projects.SpringCodeFinder.Lesson1.model.Amount;
import demo.spring.projects.SpringCodeFinder.Lesson1.service.TransferService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TransferMain {
    public static void main(String[] args) {
        //Load context
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        //Get bean
        TransferService transferService = context.getBean(TransferService.class);
        //Use transfer
        transferService.transferAmount(100L, 200L, new Amount(5000.0));
        context.close();
    }
}
