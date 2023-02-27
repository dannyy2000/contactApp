package com.evoter.request;

import java.util.Date;

public record AddPollRequest(
        Integer pollTypeId,
        Date pollDate
) {
}
