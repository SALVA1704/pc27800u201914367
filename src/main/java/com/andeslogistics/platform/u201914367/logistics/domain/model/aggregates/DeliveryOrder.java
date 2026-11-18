package com.andeslogistics.platform.u201914367.logistics.domain.model.aggregates;

import com.andeslogistics.platform.u201914367.logistics.domain.model.valueobjects.*;
import lombok.Getter;

@Getter
public class DeliveryOrder {
    Long id;
    DeliveryCode deliveryCode;
    WarehouseId warehouseId;
    DeliveryWindow deliveryWindow;
    PackageLoad packageLoad;
    Integer priorityLevel;
    DeliveryStatus status;
    String deliveryNotes;

    public DeliveryOrder(Long id, DeliveryCode deliveryCode, WarehouseId warehouseId, DeliveryWindow deliveryWindow, PackageLoad packageLoad, Integer priorityLevel, DeliveryStatus status, String deliveryNotes) {
        this.id = id;
        this.deliveryCode = deliveryCode;
        this.warehouseId = warehouseId;
        this.deliveryWindow = deliveryWindow;
        this.packageLoad = packageLoad;
        this.priorityLevel = priorityLevel;
        this.status = status;
        this.deliveryNotes = deliveryNotes;
    }

    public static DeliveryOrder create(
                         DeliveryCode deliveryCode,
                         DeliveryWindow deliveryWindow,
                         PackageLoad packageLoad,
                         Integer priorityLevel,
                         DeliveryStatus status,
                         String deliveryNotes) {
        var warehouseId = new WarehouseId();
        return new DeliveryOrder(
                null,
                deliveryCode,
                warehouseId,
                deliveryWindow,
                packageLoad,
                priorityLevel,
                status,
                deliveryNotes


        );
    }
}
