package com.example.loginpage.repository;

import com.example.loginpage.model.UsersModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<UsersModel,Integer> {

    Optional<UsersModel> findByLogin(String login);
}
