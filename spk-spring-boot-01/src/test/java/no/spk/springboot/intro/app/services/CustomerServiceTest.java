package no.spk.springboot.intro.app.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import no.spk.springboot.intro.app.database.CustomerRepository;
import no.spk.springboot.intro.app.domain.Customer;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CustomerServiceTest {

    @Autowired
    private CustomerService customerService;
    @Autowired
    private CustomerRepository repository;

    @Test
    void createCustomer() {
        customerService.createCustomer(new Customer("donald", "duck"));

        assertEquals(1, repository.findAll().size());
    }
}