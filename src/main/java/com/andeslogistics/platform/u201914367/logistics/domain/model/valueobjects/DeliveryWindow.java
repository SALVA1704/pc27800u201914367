package com.andeslogistics.platform.u201914367.logistics.domain.model.valueobjects;

import java.time.LocalDate;

public record DeliveryWindow(LocalDate startDate, LocalDate endDate) {
    /**
     * Validates the delivery window.
     *
     * @throws IllegalArgumentException with a message key if the start date is after the end date
     */
    public DeliveryWindow {
        if (startDate.isAfter(endDate)) {
            throw new IllegalArgumentException("Delivery window start date cannot be after end date");
        }
    }
    private boolean includes(LocalDate checkDate) {
        if (checkDate == null) {
            throw new IllegalArgumentException("CheckDate cannot be null");
        }
        if (checkDate.isBefore(startDate) || checkDate.isAfter(endDate)) {
            return false;
            throw new IllegalArgumentException("Delivery window start date cannot be after end date");
        }
        return true;
    }
}
