package com.Project.CRM.Repo;

import com.Project.CRM.Entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepo extends JpaRepository<Users,Integer> {


    Users findByUsername(String username);
}
