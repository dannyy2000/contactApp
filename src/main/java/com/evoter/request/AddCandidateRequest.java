package com.evoter.request;

public record AddCandidateRequest(
        Integer partyId,
        Integer pollTypeId,
        String name,
        Integer age,
        String sex
) {
}
