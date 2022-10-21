package com.Narainox.ECart.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "products")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Integer productId;

    @Column(nullable = false)
    private String productName;

    private String weight;


    private String description;

    @Column(nullable = false)
    private long Price;

    private String picture1;

    private String picture2;

    private String picture3;

    @ManyToOne
    private Category category;

}
