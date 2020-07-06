package no.spk.springboot.intro.app.services;

import org.springframework.stereotype.Service;

@Service
public class DomainService {
    public String runDomainOperation(){
        return
                """
                ||| HELLO FROM DOMAIN SERVICE |||
                ||| I AM THE BUSINESS EXPERT  |||
                """;
    }
}
