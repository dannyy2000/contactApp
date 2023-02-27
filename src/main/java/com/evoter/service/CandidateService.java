package com.evoter.service;

import com.evoter.entity.Candidate;
import com.evoter.repository.CandidateRepository;
import com.evoter.request.AddCandidateRequest;
import org.springframework.stereotype.Service;

/**
 * @author showunmioludotun
 */
@Service
public class CandidateService {
    private final CandidateRepository candidateRepository;

    public CandidateService(CandidateRepository candidateRepository) {
        this.candidateRepository = candidateRepository;
    }

    public Candidate addCandidate(AddCandidateRequest request) {
        Candidate candidate = new Candidate();
        candidate.setPartyId(request.partyId());
        candidate.setPollTypeId(request.pollTypeId());
        candidate.setName(request.name());
        candidate.setAge(request.age());
        candidate.setSex(request.sex());
        return candidateRepository.save(candidate);
    }
}
