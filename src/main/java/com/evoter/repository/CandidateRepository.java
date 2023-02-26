package com.evoter.repository;

import com.evoter.entity.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author showunmioludotun
 */
public interface CandidateRepository extends JpaRepository<Candidate, Integer> {
}
