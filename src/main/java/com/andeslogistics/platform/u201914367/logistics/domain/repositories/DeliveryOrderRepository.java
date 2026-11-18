package com.andeslogistics.platform.u201914367.logistics.domain.repositories;

import com.andeslogistics.platform.u201914367.logistics.domain.model.aggregates.DeliveryOrder;

public interface DeliveryOrderRepository {
    DeliveryOrder save(DeliveryOrder customer);
    boolean existsByDeliveryCode(String deliveryCode);
}
