package com.ibatulanand.productservice.dto;

import java.math.BigDecimal;

public class ProductResponse {
    private String id;
    private String name;
    private String description;
    private BigDecimal price;

    // 1. No-args Constructor
    public ProductResponse() {
    }

    // 2. All-args Constructor
    public ProductResponse(String id, String name, String description, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    // 3. Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public BigDecimal getPrice() { return price; }
    public void setPrice(BigDecimal price) { this.price = price; }

    // 4. Manual Builder (To keep Service logic like .map(this::mapToProductResponse) working)
    public static ProductResponseBuilder builder() {
        return new ProductResponseBuilder();
    }

    public static class ProductResponseBuilder {
        private String id;
        private String name;
        private String description;
        private BigDecimal price;

        public ProductResponseBuilder id(String id) { this.id = id; return this; }
        public ProductResponseBuilder name(String name) { this.name = name; return this; }
        public ProductResponseBuilder description(String description) { this.description = description; return this; }
        public ProductResponseBuilder price(BigDecimal price) { this.price = price; return this; }

        public ProductResponse build() {
            return new ProductResponse(id, name, description, price);
        }
    }
}
