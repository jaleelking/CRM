package com.Project.CRM.Service;

import com.Project.CRM.Entities.Customer;

import java.util.List;

public interface CustomerService {

    Customer createCust(Customer customer);

    String createCusts(List<Customer> custs);

    List<Customer> GetCustomers();

    Customer GetCustByID(Long id);

    List<String> allfirstnames();

    List<String> alllastnames();

    List<String> getAllEmails();

    List<String> getAllNumbers();

    List<Integer> getAllAges();

    List<Customer> getCustsByFname(String fname);

    List<Customer> getCustsByLname(String lname);

    Customer getCustByEmail(String email);

    Customer getCustByNumber(String number);

    List<Customer> getCustByAges(int age);

    List<Customer> getCustsByAgeAbove(int age);

    List<Customer> getCustsByAgeBelow(int age);

    Customer update(Long id, Customer cust);

    Customer updateName(Long id, String fname, String lname);

    Customer updateEmail(Long id, String email);

    Customer updateNumber(Long id, String number);


    String deleteCust(Long id);

    String deleteAllCust();

    String deleteCustByFname(String name);

    String deleteCustByLname(String name);

    String deleteCustByEmail(String email);

    String deleteCustByNumber(String number);



}
