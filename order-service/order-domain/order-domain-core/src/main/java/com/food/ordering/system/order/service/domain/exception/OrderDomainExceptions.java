package com.food.ordering.system.order.service.domain.exception;

import com.food.ordering.system.domain.exception.DomainException;

public class OrderDomainExceptions extends DomainException {

    public OrderDomainExceptions(String message) {
        super(message);
    }

    public OrderDomainExceptions(String message, Throwable cause) {
        super(message, cause);
    }
}
