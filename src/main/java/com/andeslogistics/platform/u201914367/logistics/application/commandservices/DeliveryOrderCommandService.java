package com.andeslogistics.platform.u201914367.logistics.application.commandservices;

import com.andeslogistics.platform.u201914367.logistics.application.commands.CreateDeliveryOrderCommand;
import com.andeslogistics.platform.u201914367.logistics.domain.model.aggregates.DeliveryOrder;
import com.andeslogistics.platform.u201914367.shared.application.result.Result;

public interface DeliveryOrderCommandService {

    /**
     * Handles the creation of a new delivery order.
     *
     * @param command the create delivery order command
     * @return the created delivery order, or the failure that prevented its creation
     */
    Result<DeliveryOrder, DeliveryOrderCommandFailure> handle(CreateDeliveryOrderCommand command);
}