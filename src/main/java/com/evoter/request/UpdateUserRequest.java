package com.evoter.request;

public record UpdateUserRequest(
        String name,
        Integer age,
        String nin,
        String email,
        String password,
        String sex
) {
}
