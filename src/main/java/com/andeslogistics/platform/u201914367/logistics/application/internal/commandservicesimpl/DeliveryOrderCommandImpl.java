package com.andeslogistics.platform.u201914367.logistics.application.internal.commandservicesimpl;

import com.andeslogistics.platform.u201914367.logistics.application.commands.CreateDeliveryOrderCommand;
import com.andeslogistics.platform.u201914367.logistics.application.commandservices.DeliveryOrderCommandFailure;
import com.andeslogistics.platform.u201914367.logistics.application.commandservices.DeliveryOrderCommandService;
import com.andeslogistics.platform.u201914367.logistics.domain.model.aggregates.DeliveryOrder;
import com.andeslogistics.platform.u201914367.logistics.domain.repositories.DeliveryOrderRepository;
import com.andeslogistics.platform.u201914367.shared.application.result.Result;

public class DeliveryOrderCommandImpl implements DeliveryOrderCommandService {

    private DeliveryOrderRepository deliveryOrderRepository;

    public DeliveryOrderCommandImpl(DeliveryOrderRepository deliveryOrderRepository) {
        this.deliveryOrderRepository = deliveryOrderRepository;
    }

    @Override
    public Result<DeliveryOrder, DeliveryOrderCommandFailure> handle(CreateDeliveryOrderCommand command) {
        return null;
    }
}
