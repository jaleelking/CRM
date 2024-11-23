package com.Project.CRM.Service;

import com.Project.CRM.Entities.Customer;
import com.Project.CRM.Repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    public List<Customer> GetCustomers(){
        return repo.findAll();
    }

    public Customer GetCustByID(Long id){
        return repo.findById(id).orElseThrow(()-> new RuntimeException("id asalu ledhu ra yerrepulka"));
    }

    public List<String> allfirstnames(){
        List<Customer> custs = repo.findAll();
        List<String> ans=new ArrayList<>();
        for(int i=0;i<custs.size();i++){
            ans.add(custs.get(i).getFirstname());
        }

        return ans;
    }

    public List<String> alllastnames(){
        List<Customer> custs = repo.findAll();
        List<String> ans = new ArrayList<>();
        for(int i=0;i<custs.size();i++){
            ans.add(custs.get(i).getLastname());
        }
        return ans;
    }


    public List<String> getAllEmails(){
        List<Customer> custs = repo.findAll();
        List<String> ans = new ArrayList<>();
        for(int i=0;i<custs.size();i++){
            ans.add(custs.get(i).getEmail());
        }
        return ans;
    }

    public List<String> getAllNumbers(){
        List<Customer> custs =  repo.findAll();
        List<String> ans = new ArrayList<>();
        for(int i=0;i<custs.size();i++){
            ans.add(custs.get(i).getNumber());
        }
        return ans;
    }

    public List<Integer> getAllAges(){
        List<Customer> custs =  repo.findAll();
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<custs.size();i++){
            ans.add(custs.get(i).getAge());
        }
        return ans;
    }

    public Customer getCustByFname(String fname){
        List<Customer> custs = repo.findAll();
        Customer ans=null;
        for(int i=0;i<custs.size();i++){
            if(fname.equals(custs.get(i).getFirstname())){
                ans=custs.get(i);
            }
        }
        return ans;
    }

    public Customer getCustByLname(String lname){
        List<Customer> custs = repo.findAll();
        Customer ans=null;
        for(int i=0;i<custs.size();i++){
            if(lname.equals(custs.get(i).getLastname())){
                ans=custs.get(i);
            }
        }
        return ans;
    }

    public Customer getCustByEmail(String email){
        List<Customer> custs = repo.findAll();
        Customer ans=null;
        for(int i=0;i<custs.size();i++){
            if(email.equals(custs.get(i).getEmail())){
                ans=custs.get(i);
            }
        }
        return ans;
    }

    public Customer getCustByNumber(String number){
        List<Customer> custs = repo.findAll();
        Customer ans=null;
        for(int i=0;i<custs.size();i++){
            if(number.equals(custs.get(i).getNumber())){
                ans=custs.get(i);
            }
        }
        return ans;
    }

    public List<Customer> getCustByAges(int age){
        List<Customer> custs = repo.findAll();
        List<Customer> ans = new ArrayList<>();
        for(int i=0;i<custs.size();i++){
            if(age == custs.get(i).getAge()){
                ans.add(custs.get(i));
            }
        }
        return ans;
    }

    public Customer update(Long id, Customer cust){
        Customer prevcust = repo.findById(id).orElseThrow(()->new RuntimeException("Invalid id ra pulka"));
        prevcust.setFirstname(cust.getFirstname());
        prevcust.setLastname(cust.getLastname());
        prevcust.setEmail(cust.getEmail());
        prevcust.setNumber(cust.getNumber());
        prevcust.setAge(cust.getAge());
        repo.save(prevcust);
        return prevcust;

    }

    public Customer updateName(Long id,String fname, String lname){
        Customer cust = repo.findById(id).orElseThrow(() -> new RuntimeException("number sarega evu ra puka"));
        cust.setFirstname(fname);
        cust.setLastname(lname);
        repo.save(cust);
        return cust;
    }

    public Customer updateEmail(Long id, String email){
        Customer cust = repo.findById(id).orElseThrow(()-> new RuntimeException("Invaid id ra "));
        cust.setEmail(email);
        repo.save(cust);
        return cust;
    }

    public Customer updateNumber(Long id, String number){
        Customer cust = repo.findById(id).orElseThrow(()->new RuntimeException("invalid id ra  "));
        cust.setNumber(number);
        repo.save(cust);
        return cust;
    }

    public String deleteCust(Long id){
        repo.deleteById(id);
        return "Deleted Successfully";
    }

    public String deleteAllCust(){
        repo.deleteAll();
        return "All Customers Deleted Successfully";
    }


}
