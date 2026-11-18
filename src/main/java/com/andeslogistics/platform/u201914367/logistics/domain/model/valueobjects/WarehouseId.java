package com.andeslogistics.platform.u201914367.logistics.domain.model.valueobjects;

import java.util.UUID;

public record WarehouseId(String value) {
    /**
     * Creates a new warehouse id with an auto-generated UUID.
     */
    public WarehouseId() {
        this(UUID.randomUUID().toString());
    }

    /**
     * Validates the warehouse id.
     *
     * @throws IllegalArgumentException with a message key if the value is null, blank or not a valid UUID
     */
    public WarehouseId {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException("Warehouse id cannot be null or blank");
        }
        try {
            UUID.fromString(value);
        } catch (IllegalArgumentException exception) {
            throw new IllegalArgumentException("Warehouse is not valid", exception);
        }
    }
}
