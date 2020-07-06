package no.spk.springboot.intro.app.services;

import org.springframework.stereotype.Service;

@Service
public class ApplicationService {
    private final DomainService domainService;

    public ApplicationService(DomainService domainService) {
        this.domainService = domainService;
    }

    public void runAppService() {
        System.out.printf("%n%n%s%n%n", domainService.runDomainOperation());
    }
}
