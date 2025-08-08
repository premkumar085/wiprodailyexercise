package com.wipro.mockitodemo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class OrderServiceTest {

    @Test
    void testPlaceOrder() {
    	OrderService orderService = mock(OrderService.class);
        when(orderService.placeOrder("ORD-01")).thenReturn("successful");
        String result = orderService.placeOrder("ORD-01");
        assertEquals("successful", result);
        verify(orderService).placeOrder("ORD-01");
    }
}

