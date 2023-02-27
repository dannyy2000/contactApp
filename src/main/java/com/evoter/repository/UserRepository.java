package com.evoter.repository;

import com.evoter.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author showunmioludotun
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
