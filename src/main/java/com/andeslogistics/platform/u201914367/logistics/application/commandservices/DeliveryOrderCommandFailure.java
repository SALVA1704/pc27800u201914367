package com.andeslogistics.platform.u201914367.logistics.application.commandservices;

public sealed interface DeliveryOrderCommandFailure permits DeliveryOrderCommandFailure.Duplicate {

    String messageKey();

    record Duplicate() implements DeliveryOrderCommandFailure {
        @Override
        public String messageKey() {
            return "A Delivery order with the same delivery code already exists";
        }
    }
}
