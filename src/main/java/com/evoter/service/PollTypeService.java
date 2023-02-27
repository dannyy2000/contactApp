package com.evoter.service;

import com.evoter.entity.PollType;
import com.evoter.repository.PollTypeRepository;
import com.evoter.request.AddPollTypeRequest;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author showunmioludotun
 */
@Service
public class PollTypeService {
    private final PollTypeRepository pollTypeRepository;

    public PollTypeService(PollTypeRepository pollTypeRepository) {
        this.pollTypeRepository = pollTypeRepository;
    }

    public PollType addPollType(AddPollTypeRequest request) {
        PollType pollType = new PollType();
        pollType.setName(request.name());
        return pollTypeRepository.save(pollType);
    }

    public List<PollType> getAllPollTypes() {
        return pollTypeRepository.findAll();
    }

    public PollType getPollTypeById(Long id) {
        return pollTypeRepository.findById(id).orElse(null);
    }

    public void deletePollTypeById(Long id) {
        pollTypeRepository.deleteById(id);
    }
}
