package com.example.entity;

import com.example.entity.mapperclass.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "tp_order")
public class Order extends BaseEntity {

    private String customerName;
    private String mobilePhone;
    private String shippingAddress;
    private Double totalPrice;
    private Double totalDiscount;

    @ManyToMany
    @JoinTable( name = "tp_order_product",
            joinColumns = @JoinColumn(
                name = "order_id" , referencedColumnName = "id"
            ),
            inverseJoinColumns = @JoinColumn(
                name = "product_id" , referencedColumnName = "id"
            )

    )
    private List<Product> products;




}
