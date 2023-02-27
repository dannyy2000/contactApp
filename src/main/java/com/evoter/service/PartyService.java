package com.evoter.service;

import com.evoter.entity.Party;
import com.evoter.repository.PartyRepository;
import com.evoter.request.AddPartyRequest;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author showunmioludotun
 */
@Service
public class PartyService {

    private final PartyRepository partyRepository;

    public PartyService(PartyRepository partyRepository) {
        this.partyRepository = partyRepository;
    }

    public Party addParty(AddPartyRequest request) {
        Party party = new Party();
        party.setName(request.name());
        party.setLogo(request.logo());
        return partyRepository.save(party);
    }

    public List<Party> getAllParties() {
        return partyRepository.findAll();
    }

    public Party getPartyById(Long id) {
        return partyRepository.findById(id).orElse(null);
    }

    public void deletePartyById(Long id) {
        partyRepository.deleteById(id);
    }
}
