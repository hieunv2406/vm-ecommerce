package com.vm.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Category extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoryId;

    @Column(name = "CategoryName")
    private String categoryName;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn
    @JsonIgnore
    private List<Product> products;

}
