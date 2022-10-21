package com.Narainox.ECart.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.*;
import java.util.List;

@Entity(name = "categories")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private Integer categoryId;

    @Column(nullable = false,unique = true)
    private String category;

    private String picture;

    @OneToMany(mappedBy = "category",cascade = CascadeType.ALL)
    private List<Product> products;

}
