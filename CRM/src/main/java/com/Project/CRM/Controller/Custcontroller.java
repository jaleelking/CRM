package com.Project.CRM.Controller;

import com.Project.CRM.Entities.Customer;
import com.Project.CRM.Repo.CustomerRepo;
import com.Project.CRM.Service.CustomerService;
import com.Project.CRM.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @PutMapping("/creates")
    public String CreateCusts(@RequestBody List<Customer> custs){
        return service.createCusts(custs);
    }

    @GetMapping("/getall")
    public List<Customer> GetCust(){
        return service.GetCustomers();
    }

    @GetMapping("/getone/{id}")
    public Customer getCustByID(@PathVariable Long id){
        return service.GetCustByID(id);
    }

    @GetMapping("/allfnames")
    public List<String> getallfnames(){
        return service.allfirstnames();
    }

    @GetMapping("/alllnames")
    public List<String> getAllLnames(){
        return service.alllastnames();
    }

    @GetMapping("/allemails")
    public List<String> getallemails(){
        return service.getAllEmails();
    }

    @GetMapping("/allnumbers")
    public List<String> getAllNumbers(){
        return service.getAllNumbers();
    }

    @GetMapping("/allages")
    public List<Integer> getAllAges(){
        return service.getAllAges();
    }

    @GetMapping("/getbyfname")
    public List<Customer> getbyfname(@RequestParam String fname){
        return service.getCustsByFname(fname);
    }

    @GetMapping("/getbylname")
    public List<Customer> getbylname(@RequestParam String lname){
        return service.getCustsByLname(lname);
    }

    @GetMapping("/getbyemail")
    public Customer getbyemail(@RequestParam String email){
        return service.getCustByEmail(email);
    }

    @GetMapping("/getbynumber")
    public Customer getbynumber(@RequestParam String number){
        return service.getCustByNumber(number);
    }

    @GetMapping("/getbyage")
    public List<Customer> getbyage(@RequestParam int age){
        return service.getCustByAges(age);
    }

    @GetMapping("/getbyageabove")
    public List<Customer> getByAgeAbove(@RequestParam int age){
        return service.getCustsByAgeAbove(age);
    }

    @GetMapping("/getbyagebelow")
    public List<Customer> getByAgeBelow(@RequestParam int age){
        return service.getCustsByAgeBelow(age);
    }


    @PostMapping("/update/{id}")
    public Customer update(@PathVariable Long id,@RequestBody Customer cust){
        return service.update(id,cust);
    }

    @PostMapping("/updatename")
    public Customer updateName(@RequestParam Long id, @RequestParam String fname, @RequestParam String lname){
        return service.updateName(id,fname,lname);
    }

    @PostMapping("/updateemail")
    public Customer updateemail(@RequestParam Long id, @RequestParam String email){
        return service.updateEmail(id,email);
    }

    @PostMapping("/updatenumber")
    public Customer updateNumber(@RequestParam Long id, @RequestParam String number){
        return service.updateNumber(id,number);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteCust(@PathVariable Long id){
        return service.deleteCust(id);
    }

    @DeleteMapping("/deleteAll")
    public String deleteAllCust(){
        return service.deleteAllCust();
    }

    @DeleteMapping("/deletebyfname")
    public String deleteCustByFname(@RequestParam String name){
        return service.deleteCustByFname(name);
    }

    @DeleteMapping("/deletebylname")
    public String deleteCustByLname(@RequestParam String name){
        return service.deleteCustByLname(name);
    }

    @DeleteMapping("/deletebyemail")
    public String deleteCustByEmail(@RequestParam String email){
        return service.deleteCustByEmail(email);
    }

    @DeleteMapping("/deletebynumber")
    public String deleteCustByNumber(@RequestParam String number){
        return service.deleteCustByNumber(number);
    }

}
