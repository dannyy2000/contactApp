package com.evoter.service;

import com.evoter.entity.Poll;
import com.evoter.repository.PollRepository;
import com.evoter.request.AddPollRequest;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author showunmioludotun
 */
@Service
public class PollService {
    private final PollRepository pollRepository;

    public PollService(PollRepository pollRepository) {
        this.pollRepository = pollRepository;
    }

    public Poll addPoll(AddPollRequest request) {
        Poll poll = new Poll();
        poll.setPollTypeId(request.pollTypeId());
        poll.setPollDate(request.pollDate());
        return pollRepository.save(poll);
    }

    public List<Poll> getAllPolls() {
        return pollRepository.findAll();
    }

    public Poll getPollById(Long id) {
        return pollRepository.findById(id).orElse(null);
    }

    public void deletePollById(Long id) {
        pollRepository.deleteById(id);
    }
}
