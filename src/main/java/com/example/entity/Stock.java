package com.example.entity;

import com.example.entity.mapperclass.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "tp_stock")
public class Stock extends BaseEntity {
    private Long qty;
    private Double importPrice;
    private Double importDiscount;
    private String storageLocation;
    @OneToOne(mappedBy = "stock")
    private Product product;

}
