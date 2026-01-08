package com.ibatulanand.productservice.dto;

import java.math.BigDecimal;

public class ProductRequest {
    private String name;
    private String description;
    private BigDecimal price;

    // 1. No-args Constructor
    public ProductRequest() {
    }

    // 2. All-args Constructor
    public ProductRequest(String name, String description, BigDecimal price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    // 3. Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public BigDecimal getPrice() { return price; }
    public void setPrice(BigDecimal price) { this.price = price; }

    // 4. Manual Builder (To keep Service/Controller logic working)
    public static ProductRequestBuilder builder() {
        return new ProductRequestBuilder();
    }

    public static class ProductRequestBuilder {
        private String name;
        private String description;
        private BigDecimal price;

        public ProductRequestBuilder name(String name) { this.name = name; return this; }
        public ProductRequestBuilder description(String description) { this.description = description; return this; }
        public ProductRequestBuilder price(BigDecimal price) { this.price = price; return this; }

        public ProductRequest build() {
            return new ProductRequest(name, description, price);
        }
    }
}
