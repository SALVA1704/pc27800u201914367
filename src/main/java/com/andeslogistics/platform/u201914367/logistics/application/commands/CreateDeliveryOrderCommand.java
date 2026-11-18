package com.andeslogistics.platform.u201914367.logistics.application.commands;

import com.andeslogistics.platform.u201914367.logistics.domain.model.valueobjects.*;

public record CreateDeliveryOrderCommand(
        Long id,
        String deliveryCode,
        String warehouseId,
        String deliveryWindow,
        String packageLoad,
        Integer priorityLevel,
        String status,
        String deliveryNotes
) {
    public CreateDeliveryOrderCommand {
        if (priorityLevel == null || priorityLevel<1 ||priorityLevel>5) {
            throw new IllegalArgumentException("Priority level is not valid");
        }
    }
}
