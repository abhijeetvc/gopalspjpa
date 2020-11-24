package com.gopalspringjpa.gopalspjpa.repository;

import com.gopalspringjpa.gopalspjpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
