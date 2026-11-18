package com.andeslogistics.platform.u201914367.logistics.domain.model.valueobjects;

public record DeliveryCode(String value) {
    /**
     * Validates the delivery code.
     *
     * @throws IllegalArgumentException with a message key if the value is null or blank
     */
    public DeliveryCode {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException("Delivery code cannot be null or blank");
        }
    }
}
