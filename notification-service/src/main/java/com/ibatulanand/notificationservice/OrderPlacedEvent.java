package com.ibatulanand.notificationservice;

public class OrderPlacedEvent {
    private String orderNumber;

    // No-Args Constructor (Required for JSON deserialization)
    public OrderPlacedEvent() {
    }

    // All-Args Constructor
    public OrderPlacedEvent(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    // Getter
    public String getOrderNumber() {
        return orderNumber;
    }

    // Setter
    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    @Override
    public String toString() {
        return "OrderPlacedEvent{" +
                "orderNumber='" + orderNumber + '\'' +
                '}';
    }
}
