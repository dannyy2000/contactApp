package com.evoter.repository;

import com.evoter.entity.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author showunmioludotun
 */
public interface VoteRepository extends JpaRepository<Vote, Long> {
}
