package com.example.BajajTest;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.BajajTest.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
