package nich.mihai.msscbrewery.services;

import nich.mihai.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    public CustomerDto getCustomerById(UUID customerId);
}
