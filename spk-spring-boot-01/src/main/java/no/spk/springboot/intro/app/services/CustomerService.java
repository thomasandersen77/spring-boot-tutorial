package no.spk.springboot.intro.app.services;

import no.spk.springboot.intro.app.database.CustomerRepository;
import no.spk.springboot.intro.app.domain.Customer;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * This is a domain-service because customer is a part of the domain
 */
@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Transactional
    public void createCustomer(Customer customer) {
        customerRepository.save(customer);
    }
}
