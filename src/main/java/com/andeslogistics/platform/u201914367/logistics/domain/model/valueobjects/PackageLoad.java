package com.andeslogistics.platform.u201914367.logistics.domain.model.valueobjects;

import java.time.LocalDate;

public record PackageLoad(Integer quantity, String unit) {
    /**
     * Validates the package load.
     *
     * @throws IllegalArgumentException with a message key if the quantity is null or negative
     */
    public PackageLoad {
        if (quantity == null || quantity<= 0) {
            throw new IllegalArgumentException("Quantity cannot be null or 0");
        }
        if (unit == null || unit.isBlank()) {
            throw new IllegalArgumentException("Unit cannot be null or blank");
        }

    }
    public PackageLoad increaseBy(Integer additionalQuantity){
        return new PackageLoad(quantity + 1, unit);
    }
}
