package com.food.ordering.system.order.service.domain.exception;

import com.food.ordering.system.domain.exception.DomainException;

public class OrderNotFoundExceptions extends DomainException {

    public OrderNotFoundExceptions(String message) {
        super(message);
    }

    public OrderNotFoundExceptions(String message, Throwable cause) {
        super(message, cause);
    }
}
