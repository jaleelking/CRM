package com.Project.CRM.Service;

import com.Project.CRM.Entities.Customer;
import com.Project.CRM.Repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class serviceimpl implements CustomerService {
    @Autowired
    private CustomerRepo repo;

    public serviceimpl(CustomerRepo repo) {
        this.repo = repo;
    }

    public Customer createCust(Customer customer){
        Customer savedCustomer = repo.save(customer);
        return savedCustomer;
    }
}
