package com.juanbonino.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {

}
