package Exceptions;

package com.travelcompany.eshop.exception;

public class ItineraryNotFoundException extends RuntimeException {
    public ItineraryNotFoundException(String message) {
        super(message);
    }
}
