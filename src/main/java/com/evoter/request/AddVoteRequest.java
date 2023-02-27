package com.evoter.request;

public record AddVoteRequest(
        Long userId,
        Integer candidateId,
        Integer pollId
) {
}
