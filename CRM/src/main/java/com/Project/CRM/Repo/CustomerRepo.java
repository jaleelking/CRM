package com.Project.CRM.Repo;

import com.Project.CRM.Entities.Customer;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Transactional
@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long> {
    @Query("SELECT c FROM Customer c WHERE c.firstname = :firstname")
    List<Customer> findCustomersByFirstname(String firstname);

    @Query("SELECT c FROM Customer c WHERE c.age >= :age")
    List<Customer> getCustsByAgeAbove(int age);

    @Query("SELECT c FROM Customer c WHERE c.age < :age")
    List<Customer> getCustsByAgeBelow(int age);

    @Modifying
    @Query("DELETE FROM Customer c WHERE c.firstname = :firstname")
    void deleteCustByFname(String firstname);

    @Modifying
    @Query("DELETE FROM Customer c WHERE c.lastname = :lastname")
    void deleteCustByLname(String lastname);

    @Modifying
    @Query("DELETE FROM Customer c WHERE c.email = :email")
    void deleteCustByEmail(String email);

    @Modifying
    @Query("DELETE FROM Customer c WHERE c.number = :number")
    void deleteCustByNumber(String number);
}
