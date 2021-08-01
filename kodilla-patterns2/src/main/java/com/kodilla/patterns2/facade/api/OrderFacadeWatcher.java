package com.kodilla.patterns2.facade.api;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class OrderFacadeWatcher {
    public static final Logger LOGGER = LoggerFactory.getLogger(OrderFacadeWatcher.class);

    @Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))" + " && args(order, userId) && target(object)")
    public void logEvent(OrderDto order, Long userId, Object object) {
        LOGGER.info("Order generated for user with  ID number: " + userId + "." +
                "\nOrder contains " + order.getItems().size() + " items." +
                "\nClass: " + object.getClass().getName());
    }

    @AfterThrowing("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))"+ " && target(object)")
    public void logFailureProcessingOrder(Object object) {
        LOGGER.info("There were error during processing order" +
                "\nClass: " + object.getClass().getName());
    }

    @AfterReturning("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))")
    public void logSuccessOfProcessingOrder() {
        LOGGER.info("Order was successfully processed");
    }
}
