package no.spk.springboot.intro.app;

import java.util.List;

import no.spk.springboot.intro.app.services.ApplicationService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Service;

@SpringBootApplication
public class ApplicationStarter {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext =
                SpringApplication.run(ApplicationStarter.class, args);

        List.of(applicationContext.getBeansWithAnnotation(Service.class))
                .stream()
                .flatMap(map -> map.values().stream())
                .filter(object -> object.getClass().getPackageName().startsWith("no.spk"))
                .forEach(System.err::println);

        ApplicationService applicationService = applicationContext.getBean(ApplicationService.class);
        applicationService.runAppService();
    }
}
