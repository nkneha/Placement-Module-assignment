package com.neha.userdetails.repository;

import com.neha.userdetails.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends JpaRepository<Users,Integer> {

    Users findByUserEmail(String email);


}
