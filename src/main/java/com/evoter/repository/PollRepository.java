package com.evoter.repository;

import com.evoter.entity.Poll;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author showunmioludotun
 */
public interface PollRepository extends JpaRepository<Poll, Integer> {
}
