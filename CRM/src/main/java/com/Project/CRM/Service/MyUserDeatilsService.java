package com.Project.CRM.Service;

import com.Project.CRM.Entities.UserPrincipal;
import com.Project.CRM.Entities.Users;
import com.Project.CRM.Repo.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;




//This class/file is used for Spring Security

@Service
public class MyUserDeatilsService implements UserDetailsService {

    @Autowired
    private UsersRepo usersRepo;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Users user = usersRepo.findByUsername(username);

        if(user == null){
            System.out.println("User not found ra reyy");
            return (UserDetails) new UsernameNotFoundException("User Not Found");
        }

        return new UserPrincipal(user);
    }
}
