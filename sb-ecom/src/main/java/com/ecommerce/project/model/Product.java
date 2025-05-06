package com.ecommerce.project.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long productId;
    //atlease contain 3 character
    @NotBlank
    @Size(min = 3, message = "Product name must be at least 3 characters long")
    private String productName;
    private String image;
    // 6 characters
    @NotBlank
    @Size(min = 6, message = "Product description must be at least 6 characters long")
    private String description;
    private Integer quantity;
    private double price;
    private double discount;
    private double specialPrice;


    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
