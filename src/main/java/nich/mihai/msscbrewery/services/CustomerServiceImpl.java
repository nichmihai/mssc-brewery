package nich.mihai.msscbrewery.services;

import nich.mihai.msscbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .customerId(UUID.randomUUID())
                .customerName("World of Beer")
                .build();
    }

    @Override
    public CustomerDto createNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                .customerId(UUID.randomUUID())
                .customerName("Kroger")
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        //todo impl - Customer updates
    }

    @Override
    public void deleteCustomerById(UUID customerId) {
        //todo impl - Delete customers by id
    }
}
