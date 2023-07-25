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
public class Coupon extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long couponId;

    private String couponName;

    @OneToMany(cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Product> products;

    @OneToOne(mappedBy = "coupon")
    private InvoiceItem invoiceItem;
}
