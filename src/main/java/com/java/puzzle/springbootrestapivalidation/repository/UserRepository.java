package com.java.puzzle.springbootrestapivalidation.repository;

import com.java.puzzle.springbootrestapivalidation.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
