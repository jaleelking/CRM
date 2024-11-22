package com.Project.CRM.Controller;

import com.Project.CRM.Entities.Customer;
import com.Project.CRM.Repo.CustomerRepo;
import com.Project.CRM.Service.CustomerService;
import com.Project.CRM.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Custcontroller {

    @Autowired
    private CustomerService service;

    public Custcontroller(com.Project.CRM.Service.CustomerService service) {
        this.service = service;
    }

    @PostMapping("/create")
    public Customer CreateCust(@RequestBody Customer customer){
        return service.createCust(customer);
    }

}
