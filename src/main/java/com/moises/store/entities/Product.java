package com.moises.store.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_product")
public class Product implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    private Long id;
    @Getter @Setter
    private String name;
    @Getter @Setter
    private String description;
    @Getter @Setter
    private Double price;
    @Getter @Setter
    private String imageUrl;

    @Getter
    @ManyToMany
    @JoinTable(name = "tb_product_category", joinColumns = @JoinColumn(name = "product_id"), inverseJoinColumns = @JoinColumn(name = "category_id"))
    private List<Category> categories = new ArrayList<>();

    @OneToMany(mappedBy = "id.product")
    private List<OrderItem> items = new ArrayList<>();

    // CUSTOM CONSTRUCTOR
    public Product(Long id, String name, String description, Double price, String imageUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imageUrl = imageUrl;
    }

    // Adds a category to the list of categories if it is not already present.
    public void addCategory(Category category) {
        if (!this.categories.contains(category)) {
            this.categories.add(category);
        }
    }

    // Adds an item to the list of items if it is not already present.
    @JsonIgnore
    public List<Order> getOrders() {
        List<Order> list = new ArrayList<>();
        for (OrderItem x : items) {
            if (!list.contains(x.getOrder())) {
                list.add(x.getOrder());
            }
        }
        return list;
    }
}
